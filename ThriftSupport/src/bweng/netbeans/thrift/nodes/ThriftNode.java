/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.nodes;

import bweng.netbeans.thrift.ThriftDataObject;
import org.openide.loaders.DataNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.nodes.NodeOperation;
import org.openide.util.Lookup;

/**
 * Node to represent a Thrift file in explorer views.
 */
public class ThriftNode extends DataNode
{
   public ThriftNode(ThriftDataObject obj, Children ch, Lookup lookup)
   {
      super(obj, ch, lookup);
   }
   
   private int getLine( Node n )
   {
      return ( n instanceof ThriftBaseNode ) ? ((ThriftBaseNode)n).getLine() : -1;  
   }
  
   final public void exploreNode( Node n )
   {     
      NodeOperation.getDefault().explore(n);
   }

   private Node getNodeByLine( int line, Node n )
   {     
      final int nLine = getLine( n );
      if ( line <= nLine )
      {
         return n;
      }      
      Children c = n.getChildren();
      if ( c != null )
      {
         final int N = c.getNodesCount();
         for (int i=0 ; i<N ; ++i)
         {         
            Node fn = getNodeByLine(line, c.getNodeAt(i));
            if ( null != fn )
               return fn;
         }
      }
      return null;
   }
   
   public Node getNodeByLine( int line )
   {
      Children c = getChildren();
      if ( c != null )
      {
         final int N = c.getNodesCount();
         for (int i=0 ; i<N ; ++i)
         {
            Node fn = getNodeByLine(line, c.getNodeAt(i));
            if ( null != fn )
               return fn;
         }
      }
      return this;
   }
}
