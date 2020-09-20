/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.multithreading;

/**
 *
 * @author User
 */
public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
//        t.start();
    }
    
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
}
