package bweng.netbeans.thrift;

import bweng.thrift.parser.model.ThriftFunction;
import bweng.thrift.parser.model.ThriftService;
import java.awt.Image;
import javax.swing.Action;
import org.openide.nodes.Children;
import org.openide.util.ImageUtilities;

/**
 * Node to represent a Thrift Service.
 * @author Bernd Wengenroth
 */
public class ThriftServiceNode extends ThriftBaseNode
{
   
   private ThriftService service_;

   public ThriftServiceNode(ThriftService service)
   {
      super(service);
      service_ = service;
      setDisplayName( service_.name_);      
   }
    
    @Override 
    public Image getIcon (int type) 
    { 
       return ImageUtilities.loadImage ("bweng/netbeans/thrift/ThriftService.png"); 
    } 
   
}
