/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FileReaderDemo {
    public static void main(String[] args) {
          FileReader fr;    
        try {
            fr = new FileReader("c:\\test.txt");
            int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReaderDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReaderDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
}
