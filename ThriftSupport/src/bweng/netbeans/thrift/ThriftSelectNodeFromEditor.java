/* 
 * Copyright (c) 2015 Bernd Wengenroth
 * 
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift;

import bweng.netbeans.thrift.explorer.ThriftExplorerManager;
import bweng.netbeans.thrift.nodes.ThriftNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JEditorPane;
import org.netbeans.modules.editor.NbEditorUtilities;
import org.openide.cookies.EditCookie;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.cookies.EditorCookie;
import org.openide.text.Line;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

@ActionID(
   category = "Edit",
   id = "bweng.netbeans.thrift.ThriftSelectNodeFromEditor"
)
@ActionRegistration(
   displayName = "#CTL_ThriftSelectNodeFromEditor"
)
@ActionReference(path = "Editors/text/x-thrift/Popup", position = 1100)
@Messages("CTL_ThriftSelectNodeFromEditor=Select in Tree")
public final class ThriftSelectNodeFromEditor implements ActionListener
{
   private final EditCookie context;

   public ThriftSelectNodeFromEditor(EditCookie context)
   {
      this.context = context;
   }
   
   @Override
   public void actionPerformed(ActionEvent ev)
   {
      TopComponent activeTC = TopComponent.getRegistry().getActivated();
      if ( null != activeTC )
      {           
         ThriftNode   node = activeTC.getLookup().lookup(ThriftNode.class);
         EditorCookie cookie = activeTC.getLookup().lookup(EditorCookie.class);
         ThriftExplorerManager e = ThriftExplorerManager.getInstance();
         if ( null != node && e != null)
         {
            if ( null != cookie )
            {
               JEditorPane panes[] =  cookie.getOpenedPanes();
               for ( int i=0 ; i< panes.length; ++i )
               {                  
                  if ( panes[i].hasFocus() )
                  {
                     int dot = panes[i].getCaret().getDot();
                     Line line =  NbEditorUtilities.getLine( cookie.getDocument() , dot, true );
                     int lineIdx = cookie.getLineSet().getOriginalLineNumber( line );
                     e.showThrift( (ThriftDataObject)node.getDataObject(), lineIdx );
                     break;
                  }
               }
            }
         }
      }
   }
}
