/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.strings;

/**
 *
 * @author User
 * 
String	substring​(int beginIndex)=> Returns a string that is a substring of this string.
String	substring​(int beginIndex, int endIndex)	=>Returns a string that is a substring of this string.
int	length()	
Returns the length of this string.
 */
public class StringMethods1 {
    public static void main(String[] args) {
        String s="Hello";
        String s1="hello  world";
        System.out.println(s.charAt(4)); //H
        System.out.println(s.substring(2));
        System.out.println(s.substring(0, 2));
        System.out.println(s.length());
        System.out.println(s1.length());
    }
}
