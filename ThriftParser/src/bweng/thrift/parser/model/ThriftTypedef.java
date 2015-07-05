package bweng.thrift.parser.model;

/**
 *
 * @author Bernd Wengenroth
 */
public class ThriftTypedef extends ThriftType
{
    public ThriftType reftype_;   
    
    
    @Override
    public String toString()
    {
        return "typedef "+ name_fully_qualified_+"->"+reftype_.name_fully_qualified_;
    }
}
