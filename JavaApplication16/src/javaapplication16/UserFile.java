/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Blagovesta
 */

public class UserFile extends Game {
    //записване на името, нивото 
    
    void writeInFile() throws FileNotFoundException{
        
     
         Scanner fileReader=new Scanner(new File ("src\\javaapplication16\\users.txt"));
        String txt =super.toString();
        while(fileReader.hasNextLine()){
         txt+=fileReader.nextLine();
        
        }
      
   
     fileReader.close();
     PrintStream pen = new PrintStream ("src\\javaapplication16\\users.txt");
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
