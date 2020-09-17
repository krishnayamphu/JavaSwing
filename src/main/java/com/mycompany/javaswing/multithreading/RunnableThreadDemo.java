/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.multithreading;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class RunnableThreadDemo implements Runnable {

    @Override
    public void run() {
        while(true){
        System.out.println("Hi");
        try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   

    public static void main(String[] args) {
        RunnableThreadDemo thread=new RunnableThreadDemo();
        
        Thread myThread=new Thread(thread);
        myThread.start();
    }
    
    
}
