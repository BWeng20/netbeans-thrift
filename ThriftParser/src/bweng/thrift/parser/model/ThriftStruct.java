/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.thrift.parser.model;

import java.util.List;

/**
 * Part of the data model, representing a Thrift Struct.
 */
public final class ThriftStruct extends ThriftType
{
    public List<ThriftField> fields_;
    
    @Override
    public String toString()
    {
        return "struct " + name_fully_qualified_ + fields_.toString();
    }
    
}
