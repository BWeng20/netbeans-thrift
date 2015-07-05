package bweng.thrift.parser.model;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Bernd Wengenroth
 */
public class ThriftDocument 
{   
    // Operating system dependend path where the document was loaded from or null.
    public String ospath_;
    
    public List<ThriftInclude> includes_;
    
    // All package (also all sub-packages)
    public List<ThriftPackage> packages_;   
    
    // All types defined in this document
    public Map<String, ThriftType> types_;    

    // All yet unresolved types in this document
    public Map<String, ThriftTypeRef> unresolved_types_;    

    @Override
    public String toString()
    {
        return ""+packages_;
    }
    
}
