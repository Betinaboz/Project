/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Blagovesta
 */
public class Game {
    final int tileHeigth=20;
    final int tileWidth=20;
    private static int width;
    private static int heigth;
    private static int bombCount;
    
    public void setWidth(int width){
        if(width>0)
        this.width=width;
    }
    
    public int getWidth(){
        return width;
    }
    
    public void setHeigth(int heigth){
        if (heigth>0)
            this.heigth=heigth;
    }
    
    public int getHeigth(){
        return heigth;
    }
    
    public void setBombCount(int bombCount){
        if(bombCount>0)
            this.bombCount=bombCount;
    }
    
    public int getBombCount(){
        return bombCount;
    }
    
    
    
    public void setupGame() {
     JFrame gameFrame=new JFrame();
      JPanel gamePanel=new JPanel();
      gameFrame.setSize(tileWidth*width,tileHeigth*heigth);
      gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gameFrame.add(gamePanel);
      gamePanel.setLayout(null);
      gamePanel.setBackground(new java.awt.Color(211, 234, 245));
      
      
      
}
}
