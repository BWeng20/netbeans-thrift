package bweng.thrift.parser.model;

import java.util.List;

/**
 *
 * @author Bernd Wengenroth
 */
public class ThriftService extends ThriftObject
{
    public String name_;
    public List<ThriftFunction> functions_;
    public ThriftPackage package_;

    @Override
    public String toString()
    {
        return name_+functions_;
    }    
}
