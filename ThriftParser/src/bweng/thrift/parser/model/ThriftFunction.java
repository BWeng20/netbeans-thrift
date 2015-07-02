package bweng.thrift.parser.model;

import java.util.List;

/**
 *
 * @author BWengenroth
 */
public class ThriftFunction extends ThriftObject
{
    public String name_;   
    public List<ThriftField> parameters_;
    public ThriftType return_type_;
    
    public ThriftService service_;
    
    @Override
    public String toString()
    {
        return "" + return_type_ + ' ' + name_ + parameters_;
    }
}
