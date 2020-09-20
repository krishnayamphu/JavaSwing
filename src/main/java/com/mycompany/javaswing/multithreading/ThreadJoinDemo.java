/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
public String getName(): is used to return the name of a thread.
public void setName(String name): is used to change the name of a thread.
* 
 */
public class ThreadJoinDemo extends Thread {
    
    public static void main(String[] args) {
        ThreadJoinDemo t=new ThreadJoinDemo();
        ThreadJoinDemo t2=new ThreadJoinDemo();
        
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadJoinDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t2.start();
    }
    
    @Override
    public void run(){
        
        for(int i=1; i<=5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadJoinDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
