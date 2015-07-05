package bweng.thrift.parser.model;

import java.util.List;

/**
 *
 * @author Bernd Wengenroth
 */
public class ThriftEnum extends ThriftType 
{
    public List<ThriftEnumValue> values_;
    
    @Override
    public String toString()
    {
        return "enum "+name_fully_qualified_+values_.toString();
    }
    
}
