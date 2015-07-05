package bweng.netbeans.thrift;

import bweng.thrift.parser.model.ThriftField;
import bweng.thrift.parser.model.ThriftFunction;
import bweng.thrift.parser.model.ThriftObject;
import bweng.thrift.parser.model.ThriftPackage;
import bweng.thrift.parser.model.ThriftService;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 * @author Bernd Wengenroth
 */
public class ThriftSubChildFactory extends ChildFactory<ThriftObject>
{
   
   ThriftObject childObj_;
   
   public ThriftSubChildFactory( ThriftObject childObj )
   {
      super();
      childObj_ = childObj;
   }
   
   public static boolean hasChilds( ThriftObject obj )
   {
      if ( null != obj )
      {
         if ( obj instanceof  ThriftFunction )
         {
            return 0 < ((ThriftFunction)obj).parameters_.size();
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
      }      
      return false;
   }
   
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
      }      
      return true;
   }

   @Override
   protected Node createNodeForKey(ThriftObject key)
   {
      if ( key instanceof ThriftService )
         return new ThriftServiceNode( (ThriftService)key );
      else if ( key instanceof ThriftFunction  )
         return new ThriftFunctionNode((ThriftFunction)key );
      else if ( key instanceof ThriftPackage )
         return new ThriftPackageNode( (ThriftPackage)key );
      return null;
   }
}
