package bweng.thrift.parser.model;

/**
 *
 * @author BWengenroth
 */
public class ThriftTypeRef extends ThriftType
{
    public String          declaredName_;
    public ThriftType    resolvedType_;
    
    @Override
    public String toString()
    {
        return (resolvedType_ != null) ? resolvedType_.toString() : ("UNRESOLVED:"+declaredName_);
    }
    
}
