/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.nodes;

import bweng.thrift.parser.model.*;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 * Child Factory to create Nodes for Thrift-sub-elements depending of there type.
 */
public class ThriftSubChildFactory extends ChildFactory<ThriftObject>
{
   
   ThriftObject childObj_;
   
   public ThriftSubChildFactory( ThriftObject childObj )
   {
      super();
      childObj_ = childObj;
   }
   
   /**
    * Helper methods to check if some ThriftObject shall show children or not.
    * @param obj
    * @return 
    */
   public static boolean hasChilds( ThriftObject obj )
   {
      if ( null != obj )
      {
         if ( obj instanceof  ThriftFunction )
         {
            return false ; // 0 < ((ThriftFunction)obj).parameters_.size();
         }
         else if ( obj instanceof  ThriftService )
         {
            return 0 < ((ThriftService)obj).functions_.size();
         }
         else if ( obj instanceof  ThriftPackage )
         {
            return 0 < ((ThriftPackage)obj).subpackages_.size() ||
                   0 < ((ThriftPackage)obj).services_.size();
         }
         else if ( obj instanceof  ThriftScope )
         {
            return 0 < ((ThriftScope)obj).services_.size();
            // || ((ThriftScope)obj).types_.size();
         }
      }      
      return false;
   }
   
   /**
    * Adds child-"keys" (in our case objects from the parser) into the list.
    * 
    * @param list List of Thrift object to put keys in
    * @return  true always.
    */
   @Override
   protected boolean createKeys(List<ThriftObject> list)
   {
      if ( null != childObj_ )
      {
         if ( childObj_ instanceof  ThriftFunction )
         {
            ThriftFunction f = (ThriftFunction)childObj_;
            for (ThriftField fd: f.parameters_ )
               list.add( fd );
         }
         else if ( childObj_ instanceof  ThriftService )
         {
            ThriftService s = (ThriftService)childObj_;
            for (ThriftFunction f: s.functions_ )
               list.add( f );
         }
         else if ( childObj_ instanceof  ThriftPackage )
         {
            ThriftPackage p = (ThriftPackage)childObj_;
            for (ThriftPackage sp: p.subpackages_ )
               list.add( sp );
            for (ThriftService s: p.services_ )
               list.add( s );
         }
         else if ( childObj_ instanceof  ThriftScope )
         {
            ThriftScope scope = (ThriftScope)childObj_;
            for (ThriftService s: scope.services_ )
               list.add( s );
         }
      }      
      return true;
   }

   /**
    * Creates a Node depending on the type of the parser object.
    * @param key The parser object the node shall represent.
    */
   @Override
   protected Node createNodeForKey(ThriftObject key)
   {
      if ( key instanceof ThriftService )
         return new ThriftServiceNode( (ThriftService)key );
      else if ( key instanceof ThriftFunction  )
         return new ThriftFunctionNode((ThriftFunction)key );
      else if ( key instanceof ThriftPackage )
         return new ThriftPackageNode( (ThriftPackage)key );
      else if ( key instanceof ThriftScope )
         return new ThriftScopeNode( (ThriftScope)key );
      return null;
   }
}
