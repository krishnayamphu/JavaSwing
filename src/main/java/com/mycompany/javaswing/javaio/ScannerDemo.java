/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        System.out.print("Enter any character:");
        String n=scaner.next();
        System.out.print("Enter your name:");
        String name=scaner.next();
        
        System.out.println("You entered: "+n);
        System.out.println("Name: "+name);
    }
}
