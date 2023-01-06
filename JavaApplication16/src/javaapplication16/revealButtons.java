/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.awt.PopupMenu;
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
    
    public JButton setupReveal(){
        for (int i = 0; i < b.getWidth(); i++) {
            for (int j = 0; j < b.getWidth(); j++) {
                buttonsArray[i][j].addActionListener(new revealButtons());
                return buttonsArray[i][j];
            }
        }
        return null;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        b.setLevel();
        b.setArray(bombArray);
        b.setButtons(buttonsArray);
        b.attachImg();
}

    
}

