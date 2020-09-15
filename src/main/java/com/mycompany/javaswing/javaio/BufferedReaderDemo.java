/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("c:\\test.txt"));
                int i;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }
            
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your code:");
            String code=bf.readLine();
            System.out.println("Code is: "+code);
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedReaderDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedReaderDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
