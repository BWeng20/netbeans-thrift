/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.thrift.parser.model;

/**
 *
 * @author Bernd Wengenroth
 */
public final class ThriftSetType extends ThriftType 
{
    public ThriftType value_type_;
    
    @Override
    public String toString()
    {
        return "Set<"+value_type_+">";
    }
}