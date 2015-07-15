/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.thrift.parser.model;

/**
 *
 * @author Bernd Wengenroth
 */
public final class ThriftListType extends ThriftType 
{
    public ThriftType value_type_;
    
    @Override
    public String toString()
    {
        return "List<"+value_type_+">";
    }
}
