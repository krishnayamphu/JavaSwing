/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

/**
 *
 * enum EnumClassName{VALUE1,VALUE2,...,VALUE_N;}
 * 
 * EnumClassName obj=EnumClassName.VALUE;
 */
enum Days{SUN,MON,TUE,WED,THU,FRI,SAT}
enum PrimaryColor{RED,GREEN,BLUE}
public class EnumDemo {
    public static void main(String[] args) {
        Days day=Days.FRI;
        System.out.println("Day:"+day);
        
        PrimaryColor green=PrimaryColor.GREEN;
        System.out.println("Primary Color: "+green);
    }
}
