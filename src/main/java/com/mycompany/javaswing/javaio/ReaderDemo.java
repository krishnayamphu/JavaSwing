/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ReaderDemo {
    public static void main(String[] args) {
        
        try {
            Reader reader=new FileReader("C:\\test.txt");
            int i;
            while((i=reader.read())!=-1){
            System.out.println((char)i);
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(ReaderDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
