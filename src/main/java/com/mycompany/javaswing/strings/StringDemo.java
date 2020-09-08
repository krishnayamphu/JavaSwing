/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.strings;

/**
 *
 * @author User
 */
public class StringDemo {
    public static void main(String[] args) {
        String s="text";
        
        char ch[]={'a','e','i','o','u'};
        String s1=new String(ch);
       
        byte asci[]={97,98,99,100};
        String s2=new String(asci);
        
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
