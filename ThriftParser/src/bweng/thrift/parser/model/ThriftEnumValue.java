package bweng.thrift.parser.model;

/**
 *
 * @author Bernd Wengenroth
 */
public class ThriftEnumValue extends ThriftParserInfo
{
    public String name_;
    public int value_;
    
    @Override
    public String toString()
    {
        return name_;
    }
}
