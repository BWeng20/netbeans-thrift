package bweng.netbeans.thrift;

import bweng.thrift.parser.ThriftParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.api.lexer.Language;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

final class ThriftTokenCategory
{
    ThriftTokenCategory( int id, String cat )
    {
        parserid_ = id;
        category_ = cat;
    }
    final int parserid_;
    final String category_;
}


public final class ThriftLanguageHierarchy extends  LanguageHierarchy<ThriftTokenId> 
{   
    private static List<ThriftTokenId> tokens_;
    private static Map<Integer, ThriftTokenId> idToToken_;
    private static Language<ThriftTokenId> language_ ;
      
    /**
     * Initializes the list of tokens with IDs generated from the ANTLR
     * token file.
     */
    static 
    {
        try
        {
            ThriftTokenId tokenList[] = new ThriftTokenId[]
            {
                 new ThriftTokenId( ThriftParser.INCLUDE,     ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.PACKAGE,     ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.SERVICE,     ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.TYPE_I16,    ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.TYPE_I32,    ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.TYPE_BOOL,   ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.TYPE_DOUBLE, ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.VOID,        ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.ENUM,        ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.DEFERRED,    ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.EVENT,       ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.EXCEPTION,   ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.EXTENDS,     ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.TYPEDEF,     ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.STRUCT,      ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.UNION,       ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.ONEWAY,      ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.ASYNC,       ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.LIST,        ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.MAP,         ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.SET,         ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.THROWS,      ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.REQUIRED,    ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.OPTIONAL,    ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.SENUM,       ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.CONST,       ThriftTokenId.KEYWORD),
                 new ThriftTokenId( ThriftParser.NAMESPACE,   ThriftTokenId.KEYWORD),                

                 new ThriftTokenId( ThriftParser.DOUBLE,      ThriftTokenId.NUMBER),
                 new ThriftTokenId( ThriftParser.INTEGER,     ThriftTokenId.NUMBER),
                 new ThriftTokenId( ThriftParser.HEX_INTEGER, ThriftTokenId.NUMBER),

                 new ThriftTokenId( ThriftParser.IDENTIFIER,  ThriftTokenId.IDENTIFIER),

                 new ThriftTokenId( ThriftParser.COMMENT,     ThriftTokenId.COMMENT),

                 new ThriftTokenId( ThriftParser.WS,          ThriftTokenId.WHITESPACE),
                 
                 new ThriftTokenId( ThriftParser.SEMICOLON,   ThriftTokenId.SEPARATROR),
                 new ThriftTokenId( ThriftParser.LCURLY,      ThriftTokenId.SEPARATROR),
                 new ThriftTokenId( ThriftParser.RCURLY,      ThriftTokenId.SEPARATROR),
                 new ThriftTokenId( ThriftParser.COMMA,       ThriftTokenId.SEPARATROR),
                 new ThriftTokenId( ThriftParser.COLON,       ThriftTokenId.SEPARATROR),
                 
                 new ThriftTokenId( ThriftParser.ASSIGN,      ThriftTokenId.OPERATOR)
                 
            };        
        
        tokens_ = new ArrayList<ThriftTokenId>(ThriftParser.tokenNames.length);
        for ( ThriftTokenId tk : tokenList ) tokens_.add( tk  );
            
        idToToken_ = new HashMap<Integer, ThriftTokenId>();
        for (ThriftTokenId token : tokens_) idToToken_.put(token.ordinal(), token);

        // Add any yet unmapped tokens
        for (int id = 0 ; id< ThriftParser.tokenNames.length ; ++id )
        {
            if ( !idToToken_.containsKey(id) )
            {
                ThriftTokenId tk = new ThriftTokenId( id , ThriftTokenId.DEFAULT );
                idToToken_.put( id, tk );
                tokens_.add(tk);
            }
        }
        }catch ( Throwable t )
        {
            t.printStackTrace();
        }
    }
    
      /**
     * Returns an actual CMinusTokenId from an id. This essentially allows
     * the syntax highlighter to decide the color of specific words.
     * @param id
     * @return
     */
    static synchronized ThriftTokenId getToken(int id) 
    {
        ThriftTokenId tid = idToToken_.get(id);
        if ( null == tid )
        {
            tid = new ThriftTokenId( "", ThriftTokenId.SEPARATROR , id );
            idToToken_.put(id, tid);
            // System.err.println("Unknown tokenId "+id );
        }

        return tid;
    }
    
    public static synchronized Language<ThriftTokenId> getLanguage() 
    {
        if ( null == language_ )
        {
            // System.out.println("Creating Language!");
            language_ = new ThriftLanguageHierarchy().language();
        }       
        // System.out.println("Language -> "+language_);
        return language_;
    }
    
    @Override
    protected Collection<ThriftTokenId> createTokenIds() 
    {
        return tokens_;
    }

    @Override
    protected Lexer<ThriftTokenId> createLexer(LexerRestartInfo<ThriftTokenId> info) 
    {
        return new ThriftEditorLexer(info);
    }

    @Override
    protected String mimeType() 
    {
        return ThriftDataObject.mime_type;
    }
    
}
