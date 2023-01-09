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

    private static JButton button;

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
       String text=o.getUserText().getText();
       
      boolean match=text.matches("[a-zA-Z]+");
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
       Menu.frame.dispose();
       
           
    } 
   else {
           throw new java.util.InputMismatchException("Enter letters!");
    }

    }
}
