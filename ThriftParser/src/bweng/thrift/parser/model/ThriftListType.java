/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
