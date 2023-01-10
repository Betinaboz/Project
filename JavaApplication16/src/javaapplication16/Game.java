/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;


/**
 *
 * @author Blagovesta
 */
public class Game implements ActionListener, MouseListener {
    private static int tileHeigth; 
    private static int tileWidth;
    private static int width;
    private static int heigth;
    private static int bombCount;
    private static int flags;
    private static boolean gameLost = false;
    private static boolean gameWon = false;
    private static String gameStatus;
    private static JFrame gameFrame=new JFrame();
    private static JPanel gamePanel=new JPanel();
    private static JPanel stats=new JPanel();
    private static JLabel flagsLeft;
    private static JLabel flag;
    private int [][] intButtArray;//= new int [width][heigth];
    private JButton[][] buttons;  
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
    
    
    public void setButtons (JButton buttonsArray [][]){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                buttonsArray[i][j] = buttons [i][j];
    }
        }
    }
    
    public JButton getButtons (){
         for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                return  buttons [i][j];
            }
        }
      return null;   
    }
    
    public void setTileWidth(int tileWidth){
        if (tileWidth>0)
            this.tileWidth=tileWidth;
    }
    
    public int getTileWidth(){
        return tileWidth;
    }
    
    public void setTileHeigth(int tileHeigth){
        if (tileHeigth>0)
            this.tileHeigth=tileHeigth;
    }
    
    public int getTileHeigth(){
        return tileHeigth;
    }
    
    
    public void setFlag(int flags){
        if (flags>=0){
            this.flags=flags;
        }
    }

    public int getFlag(){
        return flags;
    }
    
       public JLabel getFlagsLeft(){
        return flagsLeft;
    }
        public void setFlagsLeft(JLabel flagsLeft){
        if (flagsLeft!=null){
            this.flagsLeft=flagsLeft;
        }
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
     
     public int[] randomBombs(int width, int heigth, int bombs){
         Random rand=new Random();
         int rndmines[]=new int [bombs];
         int rndNo;
         boolean generated=false;
         int count=0;
         while(count<bombs){
             generated=false;
             rndNo=rand.nextInt(width*heigth);
              for (int i=0;i<count;i++){
                 if(rndmines[i]==rndNo){
                     generated=true;
                    count --;
                     }
               }
                 if (!generated){
                     rndmines[count]=rndNo;
                    
                 }
                 count++;
             
         }  return rndmines;
     }
     
     
     
      public void minesFormat(JButton buton[][]){
        setLevel();
        intButtArray=new int[width][heigth];
         for(int i=0;i<width;i++){
             for(int j=0; j<heigth;j++){
                 intButtArray[i][j]=0;
             }
         }
      
           
                     
                 
             
         
         int mine[]=randomBombs(width, heigth, bombCount);
         int count=0;
         for(int i=0;i<width;i++){
             for(int j=0; j<heigth;j++){
                 for (int k=0;k<mine.length;k++){
                     if (count==mine[k]){
                         intButtArray[i][j]=9; //mina
                         
                     }
                     
                 }
                 count++;
             }
         }
         
         int adjacent;
         
          for (int i = 0; i < width; i++) {
                     for (int j = 0; j < heigth; j++) {
                           adjacent = 0;
 
                           if (intButtArray[i][j] != 9) {
                                  if (i > 0 && j > 0) {
                                         if (intButtArray[i - 1][j - 1] == 9)
                                                adjacent++;
                                  }
 
                                  if (i > 0) {
                                         if (intButtArray[i - 1][j] == 9)
                                                adjacent++;
                                  }
 
                                  if (i > 0 && j < heigth - 1) {
                                         if (intButtArray[i - 1][j + 1] == 9)
                                                adjacent++;
                                  }
 
                                  if (i < width - 1 && j > 0) {
                                         if (intButtArray[i + 1][j - 1] == 9)
                                                adjacent++;
                                  }
                                  if (i < width - 1) {
                                         if (intButtArray[i + 1][j] == 9)
                                                adjacent++;
                                  }
 
                                  if (i < width - 1 && j < heigth - 1) {
                                         if (intButtArray[i + 1][j + 1] == 9)
                                                adjacent++;
                                  }
 
                                  if (j > 0) {
                                         if (intButtArray[i][j - 1] == 9)
                                                adjacent++;
                                  }
                                  if (j < heigth - 1) {
                                         if (intButtArray[i][j + 1] == 9)
                                                adjacent++;
                                  }
                                  intButtArray[i][j] = adjacent;
                           }
                     }
              }
      }
         
         public void  proba(){
          minesFormat(buttons);
          for(int i=0;i<width;i++){
              for(int j=0;j<heigth;j++){
                  System.out.print(intButtArray[i][j]);
              }
              System.out.println();
          }
      }
    
    public void attachImg(){
         loadImages();
         for(int i=0;i<width;i++){
             for(int j=0;j<heigth;j++){
                 if(intButtArray[i][j]==9)
                     buttons[i][j].setIcon(mineImageIcon);
                 if(intButtArray[i][j]==0)
                     buttons[i][j].setIcon(blankImageIcon);
                 if(intButtArray[i][j]==1)
                     buttons[i][j].setIcon(oneImageIcon);
                  if(intButtArray[i][j]==2)
                     buttons[i][j].setIcon(twoImageIcon);
                  if(intButtArray[i][j]==3)
                     buttons[i][j].setIcon(threeImageIcon);
                  if(intButtArray[i][j]==4)
                     buttons[i][j].setIcon(fourImageIcon);
                  if(intButtArray[i][j]==5)
                     buttons[i][j].setIcon(fiveImageIcon);
                  if(intButtArray[i][j]==6)
                     buttons[i][j].setIcon(sixImageIcon);
                  if(intButtArray[i][j]==7)
                     buttons[i][j].setIcon(sevenImageIcon);
                  if(intButtArray[i][j]==8)
                     buttons[i][j].setIcon(eigthImageIcon);
                 
             }
         }
     } 
    
    
    
     
    
    public void setupGame() {
      UserFile a=new UserFile();
      setLevel();
     gameFrame=new JFrame();
     gameFrame.setSize((tileWidth*width)+15,(tileHeigth*heigth)+109);
     gameFrame.setLayout(null);
     gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gameFrame.setResizable(false);
     
      gamePanel=new JPanel();
      gamePanel.setBounds(0,70, tileWidth*width, tileHeigth*heigth);
      gamePanel.setBackground(new java.awt.Color(211, 234, 245));
      
      
         flags=bombCount;
         flagsLeft = new JLabel ("");
         flagsLeft.setText(Integer.toString(flags));
         flagsLeft.setBounds(20, 20, 60, 25);
         flagsLeft.setFont(new Font("Courier New", Font.PLAIN, 18));
      
      
      stats=new JPanel();
      stats.setLayout(null);
      stats.setBounds(0,0, tileWidth*width , 70);
      stats.setBackground(new java.awt.Color(130, 177, 201));
      gameFrame.add(stats);
      gameFrame.add(gamePanel); 
       stats.add(flagsLeft);
     


       GridLayout grd = new GridLayout (width,heigth);
       gamePanel.setLayout(grd);
       buttons=new JButton[width][heigth];
       
        for (int i =0; i <heigth; i++) {
            for(int j=0; j<width;j++){
               buttons[i][j]=new JButton("");
                gamePanel.add(buttons[i][j]);
                buttons[i][j].addActionListener(this);
                buttons[i][j].addMouseListener(this); 
                buttons[i][j].setBackground(new java.awt.Color(208, 224, 242));
             

                
            }
            
        }
         minesFormat(buttons);
         proba();
         
        
         
      flag=new JLabel (" flags");
      flag.setBounds(50,20,100,25);
      flag.setFont(new Font("Courier New", Font.PLAIN, 18));
      stats.add(flag);
   
      
      
       gameFrame.setVisible(true);
       
       a.write();
      
}  
    public void win(){
        int count=0;
        for(int i=0;i<width;i++){
            for(int j=0; j<heigth; j++){
                if (buttons[i][j].getIcon()!=null || intButtArray[i][j]==0){
                    count++;
                }
            }
        }
        if((count==width*heigth)&&flags==0){
            gameWon=true;
            
        }
    }
    
    public void gameWon(){
        win();
        if (gameWon)
    JOptionPane.showMessageDialog(null, "Congrats!");
    }
    
    
    public void gameLost(){
    if (gameLost)
    JOptionPane.showMessageDialog(null, "You lost, try again");
}
    public String gameStatus(){
        if (gameWon==true) {
            setStatus("Game won");
        } 
        else if (gameLost==true) {
              setStatus("Game lost");
                }
        return gameStatus;
    }
    
    public void setStatus(String gameStatus){
        if (gameStatus != null)
            this.gameStatus = gameStatus;
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
        loadImages();
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
         if (buttons[i][j] == e.getSource()) {
                                         if (intButtArray[i][j] == 9)
                                             
                                    {   
                                         buttons[i][j].setIcon(mineImageIcon);
                                             for (int k = 0; k < width; k++) {
                                                       for (int l = 0; l < heigth; l++){
                                                          if (intButtArray[k][l] == 9)
                                                              buttons[k][l].setIcon(mineImageIcon);
                                                              
                                                           buttons[k][l].removeActionListener(this);
                                                           gameLost= true; 
                                                           
                                                       }
                                                     
                                             } 
                                             gameLost(); 
                                         }
                                         if (intButtArray[i][j] == 0 && buttons[i][j].getIcon()==null){    
                                         buttons[i][j].setIcon(blankImageIcon); 
                                     
                                          }
                                          if (intButtArray[i][j] == 1 && buttons[i][j].getIcon()==null) {
                                                buttons[i][j].setIcon(oneImageIcon);
                                               
                                                
                                         }
                                         if (intButtArray[i][j] == 2 && buttons[i][j].getIcon()==null) {
                                                buttons[i][j].setIcon(twoImageIcon);
                                                 
                                         }
                                         if (intButtArray[i][j] == 3 && buttons[i][j].getIcon()==null) {
                                                buttons[i][j].setIcon(threeImageIcon);
                                                
                                         }
                                         if (intButtArray[i][j] == 4 && buttons[i][j].getIcon()==null) {
                                                buttons[i][j].setIcon(fourImageIcon);
                                                 
                                         }
                                         if (intButtArray[i][j] == 5 && buttons[i][j].getIcon()==null) {
                                                buttons[i][j].setIcon(fiveImageIcon);
                                                
                                               
                                         }
                                         
                             }
         
         
              }
           }
          gameWon();
         }   

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        loadImages();
        int k=0;
 if (SwingUtilities.isRightMouseButton(e)){
              
                for (int i = 0; i <width ; i++)
                {
                    for (int j = 0; j < heigth; j++)
                    {
                        if (buttons[i][j] == e.getSource())
                        {
                           
                            if(buttons[i][j].getIcon()==null){
                               buttons[i][j].setIcon(flagImageIcon);
                               flags--;
                               k=1;
                               
                            }else{
                                buttons[i][j].setIcon(null);
                            }
                               
                            } 
                            
                        }
         }
    }
                
 
        
        flagsLeft.setText(Integer.toString(flags));
         }    

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
    
   
    @Override
    public String toString (  ){
        Menu menu = new Menu();
        Loginbutton lg = new Loginbutton();
        return String.format("Name:%s  \n Level:%s  \n Game status:%s \n", menu.getUserText().getText(), lg.getLevel() , gameStatus());
    }
    
    
    public Game(String name, String level, String status) {//Общо ползване
     Loginbutton lg = new Loginbutton();
        lg.setName(name);
        lg.setLevel(level);
        setStatus(status);
    }

   public Game() {//Подразбиране
        this("    ", " ", "  ");
    } 

    
    
    
    
    
    
    
            }
  
 

