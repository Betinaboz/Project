/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Blagovesta
 */
public class Game implements ActionListener{
    final int tileHeigth=20;
    final int tileWidth=20;
    private static int width;
    private static int heigth;
    private static int bombCount;
    private static int flags;
    public int timeX = 300;
    public int timeY = 60;
    
    
    
    
    
    
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
    
    public void setLevel(){
        
        switch (new Menu().getWhichLevel()){
            case 1: 
                heigth=20;
                width=20;
                bombCount=10;
                break;
            case 2:
                heigth=25;
                width=25;
                bombCount=15;
                break;
            case 3:
                heigth=30;
                width=30;
                bombCount=20;
                break;
        }
    }
    
    
    public void setupGame() {
        
      setLevel();
     JFrame gameFrame=new JFrame();
     gameFrame.setSize(tileWidth*width,(tileHeigth*heigth)+70);
     gameFrame.setLayout(null);
     gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gameFrame.setResizable(false);
     
      JPanel gamePanel=new JPanel();
      gamePanel.setLayout(null);
      gamePanel.setBounds(0,70, tileWidth*width, tileHeigth*heigth);
      gamePanel.setBackground(new java.awt.Color(211, 234, 245));
      
      
      JPanel stats=new JPanel();
      stats.setLayout(null);
      stats.setBounds(0,0, tileWidth*width , 70);
      stats.setBackground(new java.awt.Color(130, 177, 201));
      gameFrame.add(stats);
      gameFrame.add(gamePanel); 
      
      
    
       
     
       flags=bombCount;
       boolean gameLost=false;
       boolean gameWon=false;
      
       GridLayout grd = new GridLayout (20,20);
       gamePanel.setLayout(grd);
     
        for (int i = 0; i < 90; i++) {
            Button btn = new Button ();
            gamePanel.add(btn);
            
        }
       
       
       
       
       
       gameFrame.setVisible(true);
      
}

    
    
 
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
