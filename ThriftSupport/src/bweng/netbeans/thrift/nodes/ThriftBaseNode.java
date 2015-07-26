/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.nodes;

import bweng.netbeans.thrift.ThriftDataObject;
import bweng.thrift.parser.model.ThriftObject;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.Action;
import static javax.swing.Action.NAME;
import org.openide.cookies.LineCookie;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.text.Line;

/**
 * Base for the different Thrift (internal) Nodes types to encapsulate common functionality.
 */
public class ThriftBaseNode extends AbstractNode
{
   protected ThriftObject obj_;
   protected ThriftDataObject dObj_;
   
   protected ThriftBaseNode(ThriftObject obj )
   {
      super( ThriftSubChildFactory.hasChilds( obj )
            ? Children.create( new ThriftSubChildFactory(obj), true )
            : Children.LEAF
            );
      
      obj_ = obj;
      if ( obj_.getDocument() == null )
         System.out.println("Doc null "+obj_ );
   }
   
   @Override 
   public Image getOpenedIcon(int i) 
   { 
      return getIcon (i); 
   }
   
   public final int getLine()
   {
      return (null != obj_) ? obj_.line_ : -1;
   }
      
   public ThriftDataObject getThrift()
   {
      if ( null == dObj_ ) 
      {     
         try
         {
            String path = obj_.getDocument().ospath_;
            File f = FileUtil.normalizeFile( new File( path  ));
            dObj_ = (ThriftDataObject)ThriftDataObject.find( FileUtil.toFileObject( f ) );
         }
         catch (Exception ex)
         {
         }
         if ( null == dObj_ )
         {
            Node n = this.getParentNode();
            while ( (n != null) && !(n instanceof ThriftNode ) && !(n instanceof ThriftBaseNode))
               n = n.getParentNode();
            if ( n != null )
            {  
               dObj_ = (n instanceof ThriftBaseNode) ? ((ThriftBaseNode)n).getThrift() : (ThriftDataObject)((ThriftNode)n).getDataObject();
            }
         }
      }
      return dObj_;
   }
   
   protected boolean isBoundToSource()
   {
      return (null != obj_ && 0<=obj_.line_);
   }
        
   @Override
   public Action[] getActions(boolean context) 
   {
        return isBoundToSource() 
               ? new Action[]{new GotoServiceAction() }
               : new Action[]{};
   }
   
   @Override
   // Double Click / Enter on Node
   public Action getPreferredAction()
   {
      return isBoundToSource() ? new GotoServiceAction() : null;
   }
   
   // For nodes that reference some part of the file, a generic "Goto" action.
   class GotoServiceAction extends AbstractAction 
   { 
      
      public GotoServiceAction () 
      { 
         putValue (NAME, "Goto"); 
      }
      
      @Override
      public void actionPerformed(ActionEvent ae)
      {
         try
         {
            ThriftDataObject dobj = getThrift();
            if ( null != dobj )
            {
               LineCookie lc = dobj.getLookup().lookup(LineCookie.class);
               if (lc != null && null != obj_) 
               {
                  Line l = lc.getLineSet().getOriginal(obj_.line_);
                  l.show(Line.ShowOpenType.OPEN, Line.ShowVisibilityType.FRONT);
               }
            }
         }
         catch ( Exception ex)
         {
            ex.printStackTrace();
         }
      }
   }   
   
}
