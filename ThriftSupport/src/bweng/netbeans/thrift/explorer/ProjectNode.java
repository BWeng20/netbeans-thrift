/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */
package bweng.netbeans.thrift.explorer;

import java.awt.Image;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.api.project.ProjectUtils;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;

/**
 * Node to represent a project inside the Thrift Explorer.
 * 
 * @author Bernd Wengenroth
 */
final class ProjectNode extends AbstractNode
{
   final ProjectData project_;
   final Image icon_;
   
   public Project getProject()
   {
      return (project_ != null) ? project_.projectref_.get() : null;
   }
   
   
   public ProjectNode(ProjectData pd )
   {           
      super( Children.create( new ThriftScopeChildFactory(pd), true ) );
      project_ = pd;
      
      Project p = getProject();
      if ( p != null )
      {  
         setDisplayName( project_.name_ );
         icon_ = pd.icon_;
      }
      else
         icon_ = null;
   }
   
   void refresh()
   {
      Project p = getProject();
      System.out.println("ProjectNode<"+p+": refresh");
      if ( p != null )
      {
         setDisplayName( project_.name_ );
         setChildren( Children.create( new ThriftScopeChildFactory(project_), true ) );
      }
      else
      {
         setDisplayName("deleted");
         setChildren( Children.LEAF );         
      }
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
   
   protected String getProjectName()
   {
      Project p = getProject();
      if ( p != null )
      {
         ProjectInformation pinfo = ProjectUtils.getInformation(p);
         if ( pinfo != null )
         {
            return pinfo.getDisplayName();
         }
         return "no info";
      }
      else
         return "null";
   }
   
 }
