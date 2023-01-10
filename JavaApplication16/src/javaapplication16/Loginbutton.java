/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/**
 *
 * @author Blagovesta
 */
public class Loginbutton implements ActionListener {
    private static String level;
    private static String text;
    private static JButton button;
    
  
    
    

    
    public void setName(String name){
        if (name != null)
            this.text= name;
    }
    
   
    
    

    public JButton setupLoginbutton() {
        button = new JButton("Login");
        button.setBounds(70, 220, 100, 25);
        button.setFont(new Font("Courier New", Font.PLAIN, 18));
      
        button.addActionListener(new Loginbutton());
        return button;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     Game g=new Game();
     Menu o = new Menu();
     UserFile u=new UserFile();
     
       text=o.getUserText().getText();
       
      boolean match=text.matches("^[A-Za-z](?=.{1,20}$)[A-Za-z]*(?:\\h+[A-Za-z]*)*$"); //позволява на потребителя да въведе име, което да
     // съдържа само малки и големи букви и интервал до 20 на брой 
       if (match==true){
       
     if(o.getEasy().isSelected()){
      o.setWhichLevel(1);
      
      
      }
      else if (o.getMedium().isSelected()){
      o.setWhichLevel(2);
       
      }
      else if(o.getHard().isSelected()){
          o.setWhichLevel(3);
           
      } 
     
       g.setupGame();
       u.write();
       Menu.frame.dispose();
       
           
    } 
   else {
           throw new java.util.InputMismatchException("Enter letters!");
    }

    }

   
}
