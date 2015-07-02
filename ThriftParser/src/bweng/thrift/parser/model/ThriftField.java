/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bweng.thrift.parser.model;

/**
 *
 * @author BWengenroth
 */
public final class ThriftField extends ThriftObject
{
    public String name_;
    public int    id_;
    public ThriftType type_;
           
    @Override
    public String toString()
    {
        return ((type_ != null)
                ? ((type_.name_!= null) ?type_.name_ : type_.toString())
                : "?" ) + ':' + name_;
    }
    
}
