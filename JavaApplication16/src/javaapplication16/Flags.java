/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Blagovesta
 */
public class Flags implements MouseListener {
        private JButton[][] button;  
        private static int flags;
        private static JLabel flagsLeft = new JLabel ("");
        ImageIcon flagImageIcon=null;
        
    
    
    
    public JLabel flagLabel(){
         Game gam = new Game();
         gam.setLevel();
         flags= gam.getBombCount();
         flagsLeft.setText(Integer.toString(flags));
         flagsLeft.setBounds(20, 20, 60, 25);
         flagsLeft.setFont(new Font("Courier New", Font.PLAIN, 18));
         flagsLeft.addMouseListener(this);
         return flagsLeft;
    }
      
      
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Game ga = new Game();
         ga.setButtons(button);
         if (e.getButton() == MouseEvent.BUTTON3){
              System.out.println("Right Worked");
                for (int i = 0; i <ga.getWidth() ; i++)
                {
                    for (int j = 0; j < ga.getHeigth(); j++)
                    {
                        if (button[i][j] == e.getSource())
                        {   
                               button[i][j].setIcon(flagImageIcon);
                               flags--;
                        }
         }
    }
        
        flagsLeft.setText(Integer.toString(flags));
         }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
        
        
        
        
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
