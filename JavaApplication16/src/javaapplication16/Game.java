/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Blagovesta
 */
public class Game implements ActionListener{
    private static int tileHeigth; 
    private static int tileWidth;
    private static int width;
    private static int heigth;
    private static int bombCount;
    private static int flags;
    public int timeX = 300;
    public int timeY = 60;
    private static JFrame gameFrame=new JFrame();
    private static JPanel gamePanel=new JPanel();
    private static JPanel stats=new JPanel();
    private static JLabel flagsLeft;
    private static JLabel flag;
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
                heigth=10;
                width=10;
                bombCount=10;
                tileHeigth=70;
                tileWidth=70;
                break;
            case 2:
                heigth=15;
                width=15;
                bombCount=15;
                tileHeigth=50;
                tileWidth=50;
                break;
            case 3:
                heigth=20;
                width=20;
                bombCount=20;
                tileHeigth=40;
                tileWidth=40;
                break;
        }
    }
    
     public void loadImages(){
        flagImageIcon=getScaledImage("javaapplication16.images/flag.png");
        blankImageIcon=getScaledImage("javaapplication16.images/blank.png");
        mineImageIcon=getScaledImage("javaapplication16.images/mine.png");
        oneImageIcon=getScaledImage("javaapplication16.images/1.png");
        twoImageIcon=getScaledImage("javaapplication16.images/2.png");
        threeImageIcon=getScaledImage("javaapplication16.images/3.png");
        fourImageIcon=getScaledImage("javaapplication16.images/4.png");
        fiveImageIcon=getScaledImage("javaapplication16.images/5.png");
        sixImageIcon=getScaledImage("javaapplication16.images/6.png");
        sevenImageIcon=getScaledImage("javaapplication16.images/7.png");
        eigthImageIcon=getScaledImage("javaapplication16.images/8.png");
    }
    
    public void setupGame() {
        
      setLevel();
     gameFrame=new JFrame();
     gameFrame.setSize(tileWidth*width,(tileHeigth*heigth)+70);
     gameFrame.setLayout(null);
     gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gameFrame.setResizable(false);
     
      gamePanel=new JPanel();
      gamePanel.setBounds(0,70, tileWidth*width, tileHeigth*heigth);
      gamePanel.setBackground(new java.awt.Color(211, 234, 245));
      
      
      stats=new JPanel();
      stats.setLayout(null);
      stats.setBounds(0,0, tileWidth*width , 70);
      stats.setBackground(new java.awt.Color(130, 177, 201));
      gameFrame.add(stats);
      gameFrame.add(gamePanel); 
      
      flags=bombCount;
       boolean gameLost=false;
       boolean gameWon=false;

       GridLayout grd = new GridLayout (width,heigth);
       gamePanel.setLayout(grd);
     
       JButton[][] buttons = new JButton[heigth][width];  
       
        for (int i = 0; i <heigth; i++) {
            for(int j=0; j<width;j++){
               // buttons[i][j].setPreferredSize(new Dimension(tileWidth, tileHeigth));
                buttons[i][j]=new JButton("");
                gamePanel.add(buttons[i][j]);
            }
            
        }
       
       
        //shte se promenq
      flagsLeft=new JLabel(Integer.toString(flags));
      flagsLeft.setBounds(20, 20, 60, 25);
      flagsLeft.setFont(new Font("Courier New", Font.PLAIN, 18));
      stats.add(flagsLeft);
      
      flag=new JLabel ("flags");
      flag.setBounds(50,20,60,25);
      flag.setFont(new Font("Courier New", Font.PLAIN, 18));
      stats.add(flag);
       
       
       gameFrame.setVisible(true);
      
}

    
    
      public ImageIcon getScaledImage(String imageString){
          ImageIcon imageIcon=new ImageIcon(imageString);
          Image image=imageIcon.getImage();
          Image newImage=image.getScaledInstance(tileWidth,tileHeigth,java.awt.Image.SCALE_SMOOTH);
          imageIcon=new ImageIcon(newImage);
          return imageIcon;
      }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
