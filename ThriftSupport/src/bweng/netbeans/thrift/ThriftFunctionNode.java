package bweng.netbeans.thrift;

import bweng.thrift.parser.model.ThriftFunction;
import java.awt.Image;
import javax.swing.Action;
import org.openide.util.ImageUtilities;

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
 
   
    @Override 
    public Image getIcon (int type) 
    { 
       return ImageUtilities.loadImage ("bweng/netbeans/thrift/ThriftFunction.png"); 
    }    
   
}
