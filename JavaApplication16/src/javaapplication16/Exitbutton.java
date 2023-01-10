/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Blagovesta
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Blagovesta
 */
public class Exitbutton implements ActionListener {
  
private static JButton exit;// бутон за излизане от програмата

public JButton setupButton()  {
     exit=new JButton("Exit");
      exit.setBounds(220,220,100,25);
      exit.setFont(new Font("Courier New", Font.PLAIN, 18));
      exit.addActionListener( new Exitbutton ());
      return exit;
        
}

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
