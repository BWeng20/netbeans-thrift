/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the MIT License.
 * See LICENSE file for details.
 */

package bweng.netbeans.thrift.completionprovider;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.text.JTextComponent;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.CompletionUtilities;
import org.openide.util.ImageUtilities;

/**
 *
 */
public class ThriftTooltipCompletionItem implements CompletionItem
{
   static ImageIcon fieldIcon_ = new ImageIcon(ImageUtilities.loadImage("bweng/netbeans/thrift/resources/Thrift.png"));
   static Color fieldColor_ = Color.blue;

   final int caretOffset_;
   final String text_;

   ThriftTooltipCompletionItem( String text, int caretOffset )
   {
      text_ = text;
      caretOffset_ = caretOffset;
   }
   
   @Override
   public void defaultAction(JTextComponent component)
   {
   }

   @Override
   public void processKeyEvent(KeyEvent evt)
   {
   }

   @Override
   public int getPreferredWidth(Graphics graphics, Font font)
   {
      return CompletionUtilities.getPreferredWidth(text_, null, graphics, font);
   }

   @Override 
   public void render(Graphics g, Font defaultFont, Color defaultColor, Color backgroundColor, int width, int height, boolean selected) 
   { 
      CompletionUtilities.renderHtml( fieldIcon_, text_, null, g, defaultFont, (selected ? Color.white : fieldColor_), width, height, selected); 
   }

   @Override
   public CompletionTask createDocumentationTask()
   {
      return null;
   }

   @Override
   public CompletionTask createToolTipTask()
   {
      return null;
   }

   @Override
   public boolean instantSubstitution(JTextComponent component)
   {
      return false;
   }

   @Override
   public int getSortPriority()
   {
      return 0;
   }

   @Override
   public CharSequence getSortText()   
   {
      return text_;
   }

   @Override
   public CharSequence getInsertPrefix()
   {
      return text_;      
   }

}
