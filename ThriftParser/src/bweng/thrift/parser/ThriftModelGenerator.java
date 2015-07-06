package bweng.thrift.parser;

import bweng.thrift.parser.model.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

public final class ThriftModelGenerator 
{
    ThriftDocument doc_;   
    // Current package [DAI Extension]
    ThriftPackage  current_package_;
    
    // All types not resolved so far
    public Map<String, ThriftType> global_types_;    
    
    ThriftCommentLexer lexer_;
    ThriftParser   parser_;
    TokenStream tokens_;
    
    Map<String,ThriftDocument> loaded_;
    
    
    class UnknownType extends ThriftType
    {
        ThriftPackage used_in_package;
        String name;
        
        List<Object> usedin;
    }
  
    public synchronized void loadIncludes( ThriftDocument doc )
    {
        loaded_ = new HashMap<>();        
        loadIncludesInternal( doc );        
        loaded_.clear();
        
        global_types_= new HashMap<>();
        
        collect_types( doc );
        resolve_types( doc );
        
    }

    private  void collect_types( ThriftDocument doc )
    {
        if ( doc != null )
        {
            for (int i=0 ; i<doc.includes_.size() ; ++i)
                 collect_types( doc.includes_.get(i).doc_ );
            
            for ( ThriftType tp : doc.types_.values() )
            {
                if ( tp instanceof ThriftTypeRef )
                {
                    ThriftTypeRef tpr = (ThriftTypeRef)tp;
                    if ( null == tpr.resolvedType_ )
                    {
                        doc.unresolved_types_.put( tpr.declaredName_, tpr);
                    }
                }
                else
                {
                    global_types_.put( tp.name_fully_qualified_, tp);
                }
            }
        }        
    }

    private void resolve_types( ThriftDocument doc )
    {
        if ( doc != null )
        {
            for (int i=0 ; i<doc.includes_.size() ; ++i)
                 resolve_types( doc.includes_.get(i).doc_ );
        
            Iterator<ThriftTypeRef> it = doc.unresolved_types_.values().iterator();
            while ( it.hasNext() )
            {
                ThriftTypeRef tpr = it.next();

                if ( null == tpr.resolvedType_ )
                {
                    tpr.resolvedType_ = global_types_.get( tpr.declaredName_ );
                    if ( null != tpr.resolvedType_)
                    {              
                        tpr.package_ = tpr.resolvedType_.package_;
                        tpr.name_ = tpr.resolvedType_.name_;
                        tpr.name_fully_qualified_ = tpr.resolvedType_.name_fully_qualified_;
                        it.remove();
                    }
                }
            }

            if ( !doc.unresolved_types_.isEmpty() )
            {
                for( ThriftTypeRef tpr : doc.unresolved_types_.values())
                {
                    System.err.println("Unresolved "+tpr.declaredName_+" in "+tpr.package_.name_fully_qualified_ );
                }
            }
        }
    }   
   
    private void loadIncludesInternal( ThriftDocument doc )
    {        
        File docFile = new File( doc.ospath_);       
        
        for (int i=0 ; i<doc.includes_.size() ; ++i)
        {
            ThriftInclude ic = doc.includes_.get(i);
            if ( null == ic.doc_ )
            {
                try {
                    ic.ospath_ = ic.path_.replace("\\", File.separator );

                    File bf = docFile.getAbsoluteFile().getParentFile();

                    while ( null != bf)
                    {
                        File f = new File( bf.getPath() + File.separator + ic.ospath_ );
                        if ( f.exists() ) 
                        {
                            ic.ospath_ = f.getCanonicalPath();
                            ic.doc_ = loaded_.get(ic.ospath_);
                            if ( ic.doc_ == null )
                            {
                                ic.doc_ = loadDocument( ic.ospath_ );                               
                                loaded_.put(ic.ospath_, ic.doc_ );
                            }
                            break;
                        }
                        bf = bf.getParentFile();                        
                    }
                }
                catch (IOException ex)
                {
                  ex.printStackTrace();
                }                
            }
        }
        for (int i=0 ; i<doc.includes_.size() ; ++i)
        {
            ThriftInclude ic = doc.includes_.get(i);
            if ( null != ic.doc_ )
            {
                loadIncludesInternal( ic.doc_ );
            }
        }
       
    }
    
    // Gets the name of the document from the file path.
    public static String getDocumentName( String ospath )
    {
       File f = new File(ospath);      
       String name = f.getName();
       int sepidx = name.indexOf('.');
       if ( sepidx >= 0 )
         name = name.substring(0, sepidx );
       return name;
    }

    public synchronized ThriftDocument loadDocument( String ospath ) throws IOException
    {
       String name = getDocumentName( ospath );
       ThriftDocument doc = generateModel(name, new ThriftLexer(new ANTLRFileStream(ospath)));
       doc.ospath_ = ospath;
       return doc;
    }
    
    public synchronized ThriftDocument generateModel( String name, ThriftLexer lex )
    {   
        lexer_  = new ThriftCommentLexer( lex, ThriftLexer.DEFAULT_TOKEN_CHANNEL, ThriftLexer.COMMENT );
        tokens_ = new CommonTokenStream(lexer_);   
        parser_ = new ThriftParser(tokens_);
        
        ThriftDocument d = null;
        doc_ = null;
        try 
        {            
            d = gen_document( name, (CommonTree)parser_.document().getTree() );           
        }
        catch (RecognitionException ex) 
        {
            Logger.getLogger(ThriftModelGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        tokens_ = null;
        lexer_  = null;
        return d;
    }
    
    private ThriftDocument gen_document( String name, CommonTree dt )
    {
        ThriftDocument d = new ThriftDocument();
       
        current_package_ = null;
        doc_ = d;
        d.name_ = name;
        d.services_ = new ArrayList<>();
        d.types_    = new HashMap<>();
        d.unresolved_types_= new HashMap<>();
        // Add all default types to list        
        d.types_.put(ThriftType.VOID  .name_fully_qualified_, ThriftType.VOID );
        d.types_.put(ThriftType.BOOL  .name_fully_qualified_, ThriftType.BOOL );
        d.types_.put(ThriftType.INT8  .name_fully_qualified_, ThriftType.INT8 );
        d.types_.put(ThriftType.INT16 .name_fully_qualified_, ThriftType.INT16 );
        d.types_.put(ThriftType.INT32 .name_fully_qualified_, ThriftType.INT32 );
        d.types_.put(ThriftType.INT64 .name_fully_qualified_, ThriftType.INT64 );
        d.types_.put(ThriftType.DOUBLE.name_fully_qualified_, ThriftType.DOUBLE );
        d.types_.put(ThriftType.STRING.name_fully_qualified_, ThriftType.STRING );
        d.types_.put(ThriftType.BINARY.name_fully_qualified_, ThriftType.BINARY );
        
        d.packages_ = new ArrayList<>();
        d.includes_ = new ArrayList<>();
        
        parse_body( dt, 0 );

        Iterator<ThriftTypeRef> it = doc_.unresolved_types_.values().iterator();
        while ( it.hasNext() )
        {
            ThriftTypeRef tpr = it.next();

            if ( null == tpr.resolvedType_ )
            {
                // Try to find it in qualified names
                tpr.resolvedType_ = resolve_type(tpr.declaredName_ );
                if ( null == tpr.resolvedType_ && null != tpr.package_)
                {
                    // Try to find it in original scope
                    tpr.resolvedType_ = tpr.package_.findTypeInPackage( tpr.declaredName_ );
                }
                if ( null != tpr.resolvedType_)
                {              
                    tpr.package_ = tpr.resolvedType_.package_;
                    tpr.name_ = tpr.resolvedType_.name_;
                    tpr.name_fully_qualified_ = tpr.resolvedType_.name_fully_qualified_;

                    it.remove();
                }
            }
        }        
        
        doc_ = null;
        return d;
    }

    private void add_type_to_scope( ThriftType typ )
    {
        doc_.types_.put( typ.name_fully_qualified_, typ );
        if ( null != current_package_)
           current_package_.types_.add(typ);
        
    }
   
    private void add_comment( CommonTree dt, ThriftObject obj )
    {       
        obj.comment_ = lexer_.collectComment( dt.getLine()-1 );    
    }
    
    private ThriftType resolve_type( String name )
    {
        ThriftType tp = doc_.types_.get( name );
        if ( null != tp ) return tp;
        
        // Go up the package hierachy
        ThriftPackage p = current_package_;
        while( p != null )
        {
            String fqname = get_fully_qualifiedname(p, name);       
            tp = doc_.types_.get( fqname );
            if ( null != tp ) return tp;
            p = p.parent_;
        }
        return null;
    }

    
    private ThriftType find_type( String name )
    {
        ThriftType tp = resolve_type(name);
        if ( null == tp )
        {
            tp = doc_.unresolved_types_.get( name );
            if ( null == tp )
            {
                ThriftTypeRef tpr = new ThriftTypeRef();
                tpr.declaredName_ = name;
                tpr.package_ = current_package_;
                doc_.unresolved_types_.put( name , tpr);
                tp = tpr;
            }
        }
        return tp;
    }
    
    private int get_integer( CommonTree dt )
    {
        if ( null != dt )
        {
            try
            {
                switch (dt.getType() )
                {
                    case ThriftParser.INTEGER: return Integer.parseInt( dt.getText() );
                    case ThriftParser.HEX_INTEGER: 
                        String hx = dt.getText();
                        if ( hx.startsWith( "0x" )) hx = hx.substring(2);
                        return Integer.parseInt( hx , 16 );
                }
            } 
            catch (NumberFormatException nfe )
            {
            }
        }
        return Integer.MIN_VALUE;
    }
    
    private String get_identifier( CommonTree dt )
    {
        CommonTree idT = (CommonTree)dt.getFirstChildWithType(ThriftParser.IDENTIFIER);
        return ( null != idT ) ? idT.getText() : "";
        
    }
    
    private ThriftInclude gen_include( CommonTree dt )
    {
        ThriftInclude i = new ThriftInclude();
        CommonTree lt = (CommonTree)dt.getFirstChildWithType(ThriftParser.LITERAL);
        if ( null != lt )
            i.path_ = lt.getText();
        else
            i.path_ = "";
        return i;       
    }
   
    
    private ThriftPackage gen_package( CommonTree dt )
    {
        ThriftPackage p = new ThriftPackage();
        p.parent_ = current_package_;
        p.subpackages_ = new ArrayList<>();
        p.services_ = new ArrayList<>();
        p.types_= new ArrayList<>();
        p.name_ = get_identifier( dt );
        p.name_fully_qualified_ = get_fully_qualifiedname( p.name_ ) ;
        p.line_  = dt.getLine() -1 ;
        p.column_= dt.getCharPositionInLine();        

        add_comment( dt, p );
        
        current_package_ = p;
        
        parse_body(dt,1);

        current_package_ = current_package_.parent_;
        return p;
    }

    private void parse_body( CommonTree dt, int startIndex )
    {
        for (int i = startIndex ; i<dt.getChildCount() ; ++i )
        {
            CommonTree ct = (CommonTree)dt.getChild(i);
            switch ( ct.getType() )
            {   
                case ThriftParser.PACKAGE:
                    ThriftPackage np = gen_package(ct);
                    if ( null != current_package_ ) 
                       current_package_.subpackages_.add( np );
                    doc_.packages_.add( np );
                    break;
                case ThriftParser.SERVICE:         
                    ThriftService serv = gen_service( ct );
                    if ( null != current_package_ ) 
                       current_package_.services_.add(serv);
                    doc_.services_.add(serv);
                    break;
                case ThriftParser.ENUM:
                    gen_enum( ct );
                    break;
                case ThriftParser.STRUCT:
                    gen_struct( ct );
                    break;
                case ThriftParser.TYPEDEF:
                    gen_typedef( ct );
                    break;
                case ThriftParser.INCLUDE:
                    doc_.includes_.add(gen_include( ct ));
                    break;
            }
            
        }
    }

    private String get_fully_qualifiedname( ThriftPackage p, String name )
    {
        StringBuilder sb = new StringBuilder(100);
        if ( null != p)
           // [DAI Extension]: "packages" are used as parent namespace  
           sb.append( p.name_fully_qualified_);
        else
           // All content is identified by document name.
           sb.append( doc_.name_ );
        if ( 0 < sb.length() ) sb.append('.');
        sb.append(name);
        return sb.toString();                
    }
            
    private String get_fully_qualifiedname( String name )
    {
        return get_fully_qualifiedname( current_package_, name );
    }

    
    private void add_typeheaderinfo( CommonTree dt, ThriftType tp )
    {
        tp.name_ = get_identifier(dt);
        tp.name_fully_qualified_ = get_fully_qualifiedname( tp.name_ );
        tp.package_ = current_package_;
        tp.line_  = dt.getLine() - 1;
        tp.column_= dt.getCharPositionInLine();        

        add_comment(dt, tp);
    }
    
    private ThriftListType gen_listtype( CommonTree dt )
    {
        ThriftListType lt = new ThriftListType();
        if ( 0 < dt.getChildCount() )
            lt.value_type_ = gen_fieldtype( (CommonTree)dt.getChild(0) );
        return lt;
    }

    private void gen_typedef(CommonTree dt )
    {
        ThriftTypedef td = new ThriftTypedef();
        add_typeheaderinfo(dt, td);
        add_type_to_scope( td );
        if ( 1 < dt.getChildCount() )
            td.reftype_ = gen_fieldtype( (CommonTree)dt.getChild(1));        
    }
    
    private void gen_enum( CommonTree dt )
    {
        ThriftEnum en = new ThriftEnum();
        en.values_ = new ArrayList<>();
        add_typeheaderinfo( dt, en );
        
        int autoVal = 0;
        
        for (int i = 1 ; i<dt.getChildCount() ; ++i )
        {
            CommonTree ct = (CommonTree)dt.getChild(i);
            switch ( ct.getType() )
            {
                case ThriftParser.IDENTIFIER:
                    ThriftEnumValue env = new ThriftEnumValue();
                    env.name_ = ct.getText();
                    if ( 0 < ct.getChildCount() )
                    {
                         int vi = get_integer((CommonTree)ct.getChild(0));
                         if ( vi != Integer.MIN_VALUE)
                            autoVal = vi;
                    }
                    env.value_ = autoVal++;
                    en.values_.add(env);
                    break;                
            }   
        }
        add_type_to_scope( en );
    }
    
    private void gen_struct( CommonTree dt )
    {
        ThriftStruct s = new ThriftStruct();       
        add_typeheaderinfo( dt, s );
        
        s.fields_ = new ArrayList<>();
        add_type_to_scope(s);
        
        for (int i = 1 ; i<dt.getChildCount() ; ++i )
        {
            CommonTree ct = (CommonTree)dt.getChild(i);
            switch ( ct.getType() )
            {   
                case ThriftParser.FIELD_:
                    s.fields_.add( gen_field( ct ));
                    break;
            }
        }
    }

    private ThriftField gen_field( CommonTree dt )
    {
        ThriftField f = new ThriftField();       
        f.name_ = get_identifier( dt );
        add_comment( dt, f );
        
        if ( 2 <= dt.getChildCount() )
            f.type_ = gen_fieldtype( (CommonTree)dt.getChild(1) );
        f.id_ = get_integer( (CommonTree)dt.getFirstChildWithType( ThriftParser.FIELD_ID_ ) );
        return f;
    }
    
    private ThriftType gen_fieldtype( CommonTree dt )
    {
        ThriftType type = null;

        switch ( dt.getType() )
        {
            case ThriftParser.VOID:          return ThriftType.VOID;
            case ThriftParser.TYPE_BOOL:     return ThriftType.BOOL;
            case ThriftParser.TYPE_BYTE:     return ThriftType.BOOL;
            case ThriftParser.TYPE_I16:      return ThriftType.INT16;
            case ThriftParser.TYPE_I32:      return ThriftType.INT32;
            case ThriftParser.TYPE_I64:      return ThriftType.INT64;
            case ThriftParser.TYPE_DOUBLE:   return ThriftType.DOUBLE;
            case ThriftParser.TYPE_STRING:   return ThriftType.STRING;
            case ThriftParser.LIST:          return gen_listtype(dt);
            case ThriftParser.IDENTIFIER:    return find_type( dt.getText() );
                
        }
        
        return type;
    }
    
    private ThriftService gen_service( CommonTree dt )
    {
        ThriftService s = new ThriftService();
        s.name_     = get_identifier( dt );
        s.package_  = current_package_;
        s.functions_= new ArrayList<>();
        s.line_     = dt.getLine() - 1 ;
        s.column_   = dt.getCharPositionInLine();
        add_comment( dt, s );
        
        for (int i = 2 ; i<dt.getChildCount() ; ++i )
        {
            CommonTree dtF = (CommonTree)dt.getChild(i);
            switch ( dtF.getType() )
            {
                case ThriftParser.METHOD_: 
                    s.functions_.add(gen_function(dtF));
                    break;
            }
        }
        
        return s;
    }
    
    private List<ThriftField> gen_parameters(CommonTree dt )
    {
        ArrayList<ThriftField> p = new ArrayList<>();
        
        for (int i = 0 ; i<dt.getChildCount() ; ++i )
        {
            CommonTree dtP = (CommonTree)dt.getChild(i);
            switch ( dtP.getType() )
            {
                case ThriftParser.FIELD_: 
                    p.add(gen_field(dtP));
                    break;
            }
        }        
        return p;
    }
    
    private ThriftFunction gen_function( CommonTree dt )
    {
        ThriftFunction f = new ThriftFunction();
        f.name_ = get_identifier(dt);
        f.parameters_ = new ArrayList<>();        
        f.line_  = dt.getLine() - 1;
        f.column_= dt.getCharPositionInLine();        
        if ( 1 < dt.getChildCount() )
            f.return_type_ = gen_fieldtype((CommonTree)dt.getChild(1));
        
        add_comment( dt, f );        
        f.parameters_ = gen_parameters((CommonTree)dt.getFirstChildWithType(ThriftParser.ARGS_));
        return f;
    }
}
