/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/**
 *
 * @author Blagovesta
 */
public class revealButtons extends Game implements ActionListener {
    revealButtons b = new revealButtons();
    private int bombArray[][];
    private JButton buttonsArray[][];
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        b.setLevel();
        b.setArray(bombArray);
        
        for(int i=0;i<b.getWidth();i++){
             for(int j=0;j<b.getHeigth();j++){
                 /*if(bombArray[i][j]==9)
                     buttons[i][j].setIcon(mineImageIcon);
                 if(bombArray[i][j]==0)
                     buttons[i][j].setIcon(blankImageIcon);
                 if(bombArray[i][j]==1)
                     buttons[i][j].setIcon(oneImageIcon);
                  if(bombArray[i][j]==2)
                     buttons[i][j].setIcon(twoImageIcon);
                  if(bombArray[i][j]==3)
                     buttons[i][j].setIcon(threeImageIcon);
                  if(bombArray[i][j]==4)
                     buttons[i][j].setIcon(fourImageIcon);
                  if(bombArray[i][j]==5)
                     buttons[i][j].setIcon(fiveImageIcon);
                  if(bombArray[i][j]==6)
                     buttons[i][j].setIcon(sixImageIcon);
                  if(bombArray[i][j]==7)
                     buttons[i][j].setIcon(sevenImageIcon);
                  if(bombArray[i][j]==8)
                     buttons[i][j].setIcon(eigthImageIcon);
                 
             }*/
}
}
}
}
