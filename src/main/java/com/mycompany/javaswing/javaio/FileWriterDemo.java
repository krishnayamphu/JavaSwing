/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("c:\\test.txt");
            fw.write("welcome");
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
