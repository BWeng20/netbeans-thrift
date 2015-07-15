/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */

package bweng.netbeans.thrift.nodes;

import java.awt.Image;
import org.openide.util.ImageUtilities;
import bweng.thrift.parser.model.ThriftScope;

public final class ThriftScopeNode extends ThriftBaseNode {

   public ThriftScopeNode(ThriftScope scope )
   {
      super(scope);
      setDisplayName(scope.name_);
   }
   
    @Override 
    public Image getIcon (int type) 
    { 
       return ImageUtilities.loadImage ("bweng/netbeans/thrift/resources/ThriftScope.png"); 
    } 

}
