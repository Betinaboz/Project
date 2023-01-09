/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Blagovesta
 */
public class UserFile extends Game {
    
    
    void writeInFile() throws FileNotFoundException{ 
         Scanner fileReader=new Scanner(new File ("C:\\file4.txt"));
    
   File file =new File("C:\\file4.txt");
    int broi = 1;
    String txt = " ";
    while(fileReader.hasNextLine()){
        txt += broi + fileReader.nextLine()+"\n";
        broi ++;
    }
    fileReader.close();
   PrintStream pen = new PrintStream ("C:\\file4.txt");
   pen.println(txt);
    pen.close();
     
}
    
    void write(){
        try{
            writeInFile();
            
        } catch (FileNotFoundException f){
            System.out.println(f.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
