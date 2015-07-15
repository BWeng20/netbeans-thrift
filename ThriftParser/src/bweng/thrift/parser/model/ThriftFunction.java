/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.thrift.parser.model;

import java.util.List;

/**
 * Part of the data model, representing a Thrift Function inside a service.
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
