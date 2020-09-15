/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=null;
        try {
           bw=new BufferedWriter(new FileWriter("c:\\test.txt"));
            bw.append("hello");
            bw.append("world");
            bw.flush();
            
        } catch (IOException ex) {
            Logger.getLogger(BufferedWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bw.close();
        }
    }
}
