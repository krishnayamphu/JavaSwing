/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.multithreading;

/**
 getPriority()
setPriority(priority_level)
 */
public class ThreadLevelDemo extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args) {
        ThreadLevelDemo t1=new ThreadLevelDemo();
        ThreadLevelDemo t2=new ThreadLevelDemo();
        
        t1.setPriority(Thread.MIN_PRIORITY);//1
        t2.setPriority(Thread.MAX_PRIORITY); //10
        
        t1.start();
        t2.start();
    }
}
