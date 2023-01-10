/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;


import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class Menu {

    private static JLabel label;
    private static JLabel labelLevel;
    private static JTextField userText;
    private static JRadioButton easy;
    private static JRadioButton medium;
    private static JRadioButton hard;
    private static int whichLevel;
    public static JFrame frame=new JFrame();
    

     public JRadioButton getEasy(){
         return easy;
     }
    
    public JRadioButton getMedium (){
         return medium;
     }
    public JRadioButton getHard (){
         return hard;
     }
    
    public void setWhichLevel (int whichLevel) {
       if(whichLevel==1||whichLevel==2||whichLevel==3)
           this.whichLevel=whichLevel;
    }
    
    public int getWhichLevel(){
        return whichLevel;
    }
   

    public void setup() {     // създава Jframe с бутони за LogIn i Exit и опция 
        //  за  избиране на ниво
     Exitbutton b = new Exitbutton();
     Loginbutton l=new Loginbutton();
      JPanel panel=new JPanel();
      frame.setSize(500,300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      panel.setLayout(null);
      panel.setBackground(new java.awt.Color(211, 234, 245));
      

      label=new JLabel("Name:");
      label.setBounds(20, 20, 60, 25);
      label.setFont(new Font("Courier New", Font.PLAIN, 18));
      panel.add(label);

      userText=new JTextField(40);
      userText.setBounds(100,20,205,25);
      panel.add(userText);
      
      panel.add(b.setupButton());
      panel.add(l.setupLoginbutton());
   
      labelLevel=new JLabel("Level:");
      labelLevel.setBounds(20, 50, 100, 25);
      labelLevel.setFont(new Font("Courier New", Font.PLAIN, 18));
      panel.add(labelLevel);
      
      easy = new JRadioButton ("Easy");
      easy.setBounds(100, 50, 80, 25);
      easy.setFont(new Font("Courier New", Font.PLAIN, 18));
      panel.add(easy);
      easy.setBackground(new java.awt.Color(211, 234, 245));
      
      medium = new JRadioButton ("Medium");
      medium.setBounds(100, 90, 120, 25);
      medium.setFont(new Font("Courier New", Font.PLAIN, 18));
      panel.add(medium);
      medium.setBackground(new java.awt.Color(211, 234, 245));
      
      hard = new JRadioButton ("Hard");
      hard.setBounds(100, 130, 80, 25);
      hard.setFont(new Font("Courier New", Font.PLAIN, 18));
      panel.add(hard);
      hard.setBackground(new java.awt.Color(211, 234, 245));
      
      ButtonGroup G=new ButtonGroup();
      G.add(easy);
      G.add(medium);
      G.add(hard);
      
    
      frame.setVisible(true);
   

    }
    
    
    
    
    public JTextField getUserText(){
        return userText;
    }

    
    
    public String toString(){
        return String.format("%d",getWhichLevel());
    }

   

}

  

    

   
     
    
    


