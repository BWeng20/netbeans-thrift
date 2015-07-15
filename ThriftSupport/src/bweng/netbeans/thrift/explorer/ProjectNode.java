/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.explorer;

import java.awt.Image;
import java.lang.ref.WeakReference;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.api.project.ProjectUtils;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.ImageUtilities;

/**
 * Node to represent a project inside the Thrift Explorer.
 * 
 * @author Bernd Wengenroth
 */
class ProjectNode extends AbstractNode
{
   // Don't know if "weak" this is really needed, but it dones't hurt also.
   final WeakReference<Project> projectref_;
   final Image icon_;
   
   public ProjectNode(Project p )
   {     
      super( Children.create( new ThriftScopeChildFactory(p), true ) );
      projectref_ = new  WeakReference<Project>(p);
      
      ProjectInformation pinfo = ProjectUtils.getInformation(p);
      if ( pinfo != null )
      {
         //@TODO Add propery listeners to update name and icon.
         setDisplayName( pinfo.getDisplayName());
         icon_ = ImageUtilities.icon2Image(pinfo.getIcon());
      }
      else
         icon_ = ImageUtilities.loadImage ("bweng/netbeans/thrift/resources/ThriftScope.png"); 
   }
   
   @Override
   public Image getIcon(int type)
   {
      return icon_;
   }

   @Override
   public Image getOpenedIcon(int type)
   {
      return icon_;
   }
   
}
