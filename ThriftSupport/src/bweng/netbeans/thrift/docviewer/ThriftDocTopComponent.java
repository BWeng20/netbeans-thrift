/* 
 * Copyright (c) 2015 Bernd Wengenroth
 * 
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.docviewer;

import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerUtils;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays thrift documentation.
 */
@ConvertAsProperties(
   dtd = "-//bweng.netbeans.thrift.docviewer//ThriftDoc//EN",
   autostore = false
)
@TopComponent.Description(
   preferredID = "ThriftDocTopComponent",
   iconBase = "bweng/netbeans/thrift/resources/Thrift.png",
   persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "output", openAtStartup = false)
@ActionID(category = "Window", id = "bweng.netbeans.thrift.docviewer.ThriftDocTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
   displayName = "#CTL_ThriftDocAction",
   preferredID = "ThriftDocTopComponent"
)
@Messages(
   {
      "CTL_ThriftDocAction=ThriftDoc",
      "CTL_ThriftDocTopComponent=ThriftDoc Window",
      "HINT_ThriftDocTopComponent=Thrift Documentation viewer"
   })
public final class ThriftDocTopComponent extends TopComponent
{

   public ThriftDocTopComponent()
   {
      setLayout(new java.awt.BorderLayout());
      setName(Bundle.CTL_ThriftDocTopComponent());
      setToolTipText(Bundle.HINT_ThriftDocTopComponent());
      
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   // End of variables declaration//GEN-END:variables
   @Override
   public void componentOpened()
   {
      // thriftDocResult_ = Utilities.actionsGlobalContext().lookupResult(Person.class);
      // personResult.addLookupListener(this);
   }

   @Override
   public void componentClosed()
   {
      // TODO add custom code on component closing
   }

   void writeProperties(java.util.Properties p)
   {
      // better to version settings since initial version as advocated at
      // http://wiki.apidesign.org/wiki/PropertyFiles
      p.setProperty("version", "1.0");
      // TODO store your settings
   }

   void readProperties(java.util.Properties p)
   {
      String version = p.getProperty("version");
      // TODO read your settings according to their version
   }
}
