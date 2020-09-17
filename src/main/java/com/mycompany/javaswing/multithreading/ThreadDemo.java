/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ThreadDemo extends Thread {
    
    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        td.start();
        
        
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println("Hello !");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    }
}
