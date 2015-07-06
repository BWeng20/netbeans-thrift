package bweng.thrift.parser.model;

import java.util.List;

/**
 * Package [DAI Extension]. 
 * @author Bernd Wengenroth
 */
public class ThriftPackage extends ThriftObject
{
     
    public String name_;
    public String name_fully_qualified_;
    
    public List<ThriftService> services_;
    // Direct sub packages
    public List<ThriftPackage> subpackages_;    
    // types
    public List<ThriftType> types_;
    public ThriftPackage parent_;
    
    
    @Override
    public String toString()
    {
        return "package "+name_+services_+" "+subpackages_;
    }
    
    public ThriftType findTypeInPackage( String name )
    {       
        if ( name.startsWith( name_fully_qualified_+'.' ))
            name = name.substring( name_fully_qualified_.length()+1 );
        
        if ( 0 <= name.indexOf('.' ))
        {
            // Search in sub packages
            for (int pi=0 ; pi<subpackages_.size() ; ++pi )
            {
                ThriftPackage subp = subpackages_.get(pi);
                if ( name.startsWith( subp.name_+'.' ) )
                {
                    ThriftType t = subp.findTypeInPackage( name.substring(subp.name_.length()+1 ) );
                    if ( t != null ) return t;
                }
            }
        }
        else
        {
            for (int ti=0 ; ti<types_.size() ; ++ti )
                if ( types_.get(ti).name_.equals(name))
                    return types_.get(ti);
        }
        return null;
    }
}
