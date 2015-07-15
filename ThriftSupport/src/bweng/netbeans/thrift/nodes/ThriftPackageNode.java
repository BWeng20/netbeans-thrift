/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.nodes;

import bweng.thrift.parser.model.ThriftPackage;
import java.awt.Image;
import org.openide.util.ImageUtilities;

/**
 * Node to represent a Thrift-Package [DAI extension]
 * 
 * @see ThriftPackage
 */
public class ThriftPackageNode extends ThriftBaseNode
{
   public ThriftPackageNode(ThriftPackage pg)
   {
      super(pg);
      setDisplayName( pg.name_ );  
   }
   
    @Override 
    public Image getIcon (int type) 
    { 
       return ImageUtilities.loadImage ("bweng/netbeans/thrift/resources/ThriftPackage.png"); 
    } 
   
}
