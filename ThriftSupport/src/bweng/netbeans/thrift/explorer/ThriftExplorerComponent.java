package bweng.netbeans.thrift.explorer;

import bweng.netbeans.thrift.ThriftDataObject;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.netbeans.api.project.Project;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

@ConvertAsProperties(
   dtd = "-//bweng.netbeans.thrift.explorer//ThriftExplorer//EN",
   autostore = false
)
@TopComponent.Description(
   preferredID = "ThriftExplorerTopComponent",
   iconBase = "bweng/netbeans/thrift/resources/Thrift.png",
   persistenceType = TopComponent.PERSISTENCE_NEVER
)
@TopComponent.Registration(mode = "explorer", openAtStartup = true)
@ActionID(category = "Window", id = "bweng.netbeans.thrift.explorer.ThriftExplorerTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
   displayName = "#CTL_ThriftExplorerAction",
   preferredID = "ThriftExplorerTopComponent" //< This ensures that the explorer is a singleton.
)
@Messages(
   {
      "CTL_ThriftExplorerAction=ThriftExplorer",
      "CTL_ThriftExplorerTopComponent=Thrift Explorer",
      "HINT_ThriftExplorerTopComponent=This is a Thrift explorer"
   })
public final class ThriftExplorerComponent extends TopComponent implements ExplorerManager.Provider
{
   private final transient ExplorerManager explorerManager_ = new ExplorerManager();
   static private WeakReference<ThriftExplorerComponent> instance_;
   private final transient ProjectChildFactory factory_ = new ProjectChildFactory();
   private BeanTreeView scrollPane_;

   public ThriftExplorerComponent()
   {
      scrollPane_ = new BeanTreeView();
      scrollPane_.setRootVisible( false );

      setLayout(new java.awt.BorderLayout());
      add(scrollPane_, java.awt.BorderLayout.CENTER);
 
      setName(Bundle.CTL_ThriftExplorerTopComponent());
      setToolTipText(Bundle.HINT_ThriftExplorerTopComponent());

      associateLookup(ExplorerUtils.createLookup(explorerManager_, getActionMap()));

      explorerManager_.setRootContext(new AbstractNode(Children.create( factory_, true )));
      explorerManager_.getRootContext().setDisplayName("Thrift Files");

      instance_ = new WeakReference<ThriftExplorerComponent>(this);
   }

   static public ThriftExplorerComponent getInstance()
   {
      return (null != instance_) ? instance_.get() : null;
   }

   public void refreshProject(Project project)
   {
      Node root  = explorerManager_.getRootContext();
      Children chds = root.getChildren();
      for (Node cnode : Arrays.asList(chds.getNodes()))
      {
         if ( cnode instanceof ProjectNode)
         {
            ProjectNode pnode =(ProjectNode)cnode;
            if ( pnode.projectref_.get() == project )
            {
               pnode.refresh();
            }
         }
      }      
   }

   @Override
   public ExplorerManager getExplorerManager()
   {
      return explorerManager_;
   }

   public void showThrift(ThriftDataObject thriftDataObject, int lineIdx)
   {
      explorerManager_.getRootContext();
   }
   
   @Override
   public void componentOpened()
   {
      factory_.startUpdate();
   }

   @Override
   public void componentClosed()
   {
      factory_.stopUpdate();
   }

   void writeProperties(java.util.Properties p)
   {
      p.setProperty("version", "1.0");
      // TODO store your settings
   }

   void readProperties(java.util.Properties p)
   {
      String version = p.getProperty("version");
      // TODO read your settings according to their version
   }
}
