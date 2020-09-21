/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class Car1 extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
        System.out.println("Car1 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Car1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class Car2 extends Thread{
     @Override
    public void run(){
        for(int i=1; i<=5; i++){
        System.out.println("Car2 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Car1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class MyCarRacingGame {
    public static void main(String[] args) {
        Car1 c1=new Car1();
        Car2 c2=new Car2();
        
        c1.start();
        c2.start();
    }
}
