/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author blagovestadb
 */
public class setupReveal implements MouseListener {
     private int [][] intButtArrayy;
     private JButton[][] buttonsArr;
     ImageIcon flagImageIcon=null;
    ImageIcon blankImageIcon=null;
    ImageIcon mineImageIcon=null;
    ImageIcon oneImageIcon=null;
    ImageIcon twoImageIcon=null;
    ImageIcon threeImageIcon=null;
    ImageIcon fourImageIcon=null;
    ImageIcon fiveImageIcon=null;
    ImageIcon sixImageIcon=null;
    ImageIcon sevenImageIcon=null;
    ImageIcon eigthImageIcon=null;
     
     public ImageIcon getBlank(){
        return blankImageIcon;
    }
    
     
     
     
     
    public void loadImages() {
        flagImageIcon=getScaledImage("src\\image\\flag.png");
        blankImageIcon=getScaledImage("src\\image\\blank.png");
        mineImageIcon=getScaledImage("src\\image\\mine.png");
        oneImageIcon=getScaledImage("src\\image\\1.png");
        twoImageIcon=getScaledImage("src\\image\\2.png");
        threeImageIcon=getScaledImage("src\\image\\3.png");
        fourImageIcon=getScaledImage("src\\image\\4.png");
        fiveImageIcon=getScaledImage("src\\image\\5.png");
        sixImageIcon=getScaledImage("src\\image\\6.png");
        sevenImageIcon=getScaledImage("src\\image\\7.png");
        eigthImageIcon=getScaledImage("src\\image\\8.png");
           
        
    }
    public ImageIcon getScaledImage(String imageString){
          Game g = new Game();
          ImageIcon imageIcon=new ImageIcon(imageString);
          Image image=imageIcon.getImage();
          Image newImage=image.getScaledInstance(g.getTileWidth(),g.getTileHeigth(),java.awt.Image.SCALE_SMOOTH);
          imageIcon=new ImageIcon(newImage);
          return imageIcon;
      }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Game r = new Game();
        
       
        int mouseX = e.getX()/new Game().getTileWidth();
        int mouseY = e.getY()/new Game().getTileHeigth();
        r.setButtons(buttonsArr);
        r.setArray(intButtArrayy);
        loadImages();
        if(intButtArrayy[mouseX][mouseY]==9)
                     buttonsArr[mouseX][mouseY].setIcon(mineImageIcon);
                 if(intButtArrayy[mouseX][mouseY]==0)
                     buttonsArr[mouseX][mouseY].setIcon(blankImageIcon);
                 if(intButtArrayy[mouseX][mouseY]==1)
                     buttonsArr[mouseX][mouseY].setIcon(oneImageIcon);
                  if(intButtArrayy[mouseX][mouseY]==2)
                     buttonsArr[mouseX][mouseY].setIcon(twoImageIcon);
                  if(intButtArrayy[mouseX][mouseY]==3)
                     buttonsArr[mouseX][mouseY].setIcon(threeImageIcon);
                  if(intButtArrayy[mouseX][mouseY]==4)
                     buttonsArr[mouseX][mouseY].setIcon(fourImageIcon);
                  if(intButtArrayy[mouseX][mouseY]==5)
                     buttonsArr[mouseX][mouseY].setIcon(fiveImageIcon);
                  if(intButtArrayy[mouseX][mouseY]==6)
                     buttonsArr[mouseX][mouseY].setIcon(sixImageIcon);
                  if(intButtArrayy[mouseX][mouseY]==7)
                     buttonsArr[mouseX][mouseY].setIcon(sevenImageIcon);
                  if(intButtArrayy[mouseX][mouseY]==8)
                     buttonsArr[mouseX][mouseY].setIcon(eigthImageIcon);
                  System.out.println();
    }

    
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
}
