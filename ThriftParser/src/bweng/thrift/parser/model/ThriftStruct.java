/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bweng.thrift.parser.model;

import java.util.List;

/**
 *
 * @author Bernd Wengenroth
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
