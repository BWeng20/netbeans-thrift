package bweng.netbeans.thrift;

import bweng.thrift.parser.model.ThriftFunction;
import javax.swing.Action;
import org.openide.nodes.Children;
import org.openide.util.Lookup;

/**
 * @author Bernd Wengenroth
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
   public Action[] getActions(boolean context) 
   {
        return new Action[]{new GotoServiceAction(function_.line_) };
   }
   
}
