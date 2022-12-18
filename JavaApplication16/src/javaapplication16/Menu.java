/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Blagovesta
 */
public class Menu implements ActionListener{

    private static JLabel label;
    private static JLabel labelLevel;
    private static JTextField userText;
    private static JButton button;
    private static JRadioButton easy;
    private static JRadioButton medium;
    private static JRadioButton hard;
    

     

    public void setup() {
     Exitbutton b = new Exitbutton();
      JFrame frame=new JFrame();
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

      button=new JButton("Login");
      button.setBounds(70,220,100,25);
      button.setFont(new Font("Courier New", Font.PLAIN, 18));
      button.addActionListener(new Menu());
      panel.add(button);
      
      
      panel.add(b.setupButton());
   
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
