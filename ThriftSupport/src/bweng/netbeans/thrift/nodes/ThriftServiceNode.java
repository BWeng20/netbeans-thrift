/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.nodes;

import bweng.thrift.parser.model.ThriftService;
import java.awt.Image;
import org.openide.util.ImageUtilities;

/**
 * Node to represent a Thrift Service.
 * 
 * @author Bernd Wengenroth
 */
public class ThriftServiceNode extends ThriftBaseNode
{
   
   private ThriftService service_;

   public ThriftServiceNode(ThriftService service)
   {
      super(service);
      service_ = service;
      setDisplayName( service_.name_);      
   }
    
    @Override 
    public Image getIcon (int type) 
    { 
       return ImageUtilities.loadImage ("bweng/netbeans/thrift/resources/ThriftService.png"); 
    } 
   
}
