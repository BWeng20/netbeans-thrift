package bweng.netbeans.thrift;

import bweng.thrift.parser.model.ThriftObject;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import static javax.swing.Action.NAME;
import org.openide.cookies.LineCookie;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.text.Line;
import org.openide.util.Lookup;

/**
 * Base for the different Thrift Nodes types to encapsulate common functionalty.
 * @author Bernd Wengenroth
 */
class ThriftBaseNode extends AbstractNode
{
   ThriftObject obj_;  
   
   ThriftBaseNode(ThriftObject obj )
   {
      super( ThriftSubChildFactory.hasChilds( obj )
            ? Children.create( new ThriftSubChildFactory(obj), true )
            : Children.LEAF
            );
      
      obj_ = obj;
   }
   
   @Override 
   public Image getOpenedIcon(int i) 
   { 
      return getIcon (i); 
   }
      
   public ThriftDataObject getThrift()
   {
      Node n = this.getParentNode();
      while ( (n != null) && !(n instanceof ThriftNode ))
         n = n.getParentNode();
      if ( n != null )
         return (ThriftDataObject)((ThriftNode)n).getDataObject();
      else
         return null;
   }
   
   @Override
   public Action[] getActions(boolean context) 
   {
        return new Action[]{new GotoServiceAction(obj_.line_) };
   }
   
   // For nodes that reference some part of the file, a generic "Goto" action.
   class GotoServiceAction extends AbstractAction 
   { 
      // 0-based index of the line of declaration.
      private int line_;
      
      public GotoServiceAction (int line) 
      { 
         putValue (NAME, "Goto"); 
         line_ = line;
      }
      
      @Override
      public void actionPerformed(ActionEvent ae)
      {
         ThriftDataObject dobj = getThrift();
         if ( null != dobj )
         {
            LineCookie lc = dobj.getLookup().lookup(LineCookie.class);
            if (lc != null) 
            {
               Line l = lc.getLineSet().getOriginal(line_);
               l.show(Line.ShowOpenType.OPEN, Line.ShowVisibilityType.FRONT);
            }
         }
      }
   }   
   
}
