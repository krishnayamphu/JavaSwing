/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.multithreading;

/**
 *
public String getName(): is used to return the name of a thread.
public void setName(String name): is used to change the name of a thread.
 */
public class ThreadNameDemo extends Thread {
    public static void main(String[] args) {
        ThreadNameDemo t1=new ThreadNameDemo();
        ThreadNameDemo t2=new ThreadNameDemo();
        
        t1.start(); //thread-0
        
        t2.start(); //mythread
        
        t2.setName("mythread");
        
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        
  
        
    }
    @Override
    public void run(){
        System.out.println("hello world !");
    }
}
