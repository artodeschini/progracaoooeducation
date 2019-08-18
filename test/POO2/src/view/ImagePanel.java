/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author daniel.s.oliveira
 */
public class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(){
      
  }
  
  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
      setImage(img);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
  
  public void setImage(String img){
      setImage(new ImageIcon(img).getImage());
  }
  
  public void setImage(Image img){
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

}