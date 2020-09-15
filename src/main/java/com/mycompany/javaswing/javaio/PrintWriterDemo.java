/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        try {
            PrintWriter pw=new PrintWriter(new FileWriter("c:\\test.txt"));
            pw.write("java-progarmming");
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(PrintWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
