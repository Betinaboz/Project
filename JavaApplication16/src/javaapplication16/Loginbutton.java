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
     button=new JButton("Login");
      button.setBounds(70,220,100,25);
      button.setFont(new Font("Courier New", Font.PLAIN, 18));
      button.addActionListener(new Menu());
      return button;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        Menu o = new Menu();
        String text=o.getUserText().getText();
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
