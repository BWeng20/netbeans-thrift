/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.nodes;

import bweng.thrift.parser.model.ThriftFunction;
import java.awt.Image;
import org.openide.util.ImageUtilities;

/**
 * Node to represent a Thrift Function.
 * 
 * @see ThriftFunction
 */
public class ThriftFunctionNode extends ThriftBaseNode
{
   private final ThriftFunction function_;
   
   public ThriftFunctionNode(ThriftFunction function)
   {
      super(function );
      function_ = function;
      setDisplayName( function_.name_ );
   }
  
    @Override 
    public Image getIcon (int type) 
    { 
       return ImageUtilities.loadImage ("bweng/netbeans/thrift/resources/ThriftFunction.png"); 
    }    
   
}
