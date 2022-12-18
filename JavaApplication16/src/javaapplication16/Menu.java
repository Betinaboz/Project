/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author vikto
 */

  
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

/**
 *
 * @author vikto
 */
public class Menu implements ActionListener{

    private static JLabel label;
    private static JTextField userText;
    private static JButton button;
   // private static JButton success;

     

    public static void main(String[] args) {
     
      JFrame frame=new JFrame();
      JPanel panel=new JPanel();
      frame.setSize(400,500);
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

      button=new JButton("Login");
      button.setBounds(50,390,100,25);
      button.setFont(new Font("Courier New", Font.PLAIN, 18));
      button.addActionListener(new Menu());
      panel.add(button);
      
   /*   success=new JButton("");
      success.setBounds(280,150,100,25);
      success.setFont(new Font("Courier New", Font.PLAIN, 18));
      success.setVisible(false);
      success.addActionListener(new Menu());
      panel.add(success);
  */
      frame.setVisible(true);


    }
  
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String text=userText.getText();
        boolean match=text.matches("[a-zA-Z]+");
       if (match){
           //open Game JPanel
         //  success.setVisible(true);
         //  success.setText("Go");
       }
       else {
           throw new java.util.InputMismatchException("Enter letters!");
            
       } 
        
        
    }
    
    
    

}
