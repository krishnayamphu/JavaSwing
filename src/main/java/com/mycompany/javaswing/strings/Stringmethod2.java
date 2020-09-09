/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.strings;

/**
String value conversion:
=======================
static String	valueOf​(boolean b)	
Returns the string representation of the boolean argument.
static String	valueOf​(char c)	
Returns the string representation of the char argument.
static String	valueOf​(char[] data)	
Returns the string representation of the char array argument.
static String	valueOf​(char[] data, int offset, int count)	
Returns the string representation of a specific subarray of the char array argument.
static String	valueOf​(double d)	
Returns the string representation of the double argument.
static String	valueOf​(float f)	
Returns the string representation of the float argument.
static String	valueOf​(int i)	
Returns the string representation of the int argument.
static String	valueOf​(long l)	
Returns the string representation of the long argument.
static String	valueOf​(Object obj)	
Returns the string representation of the Object argument.
* 
String Trim:
==================
String	trim()	
Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
 
char[]	toCharArray()	
Converts this string to a new character array.
 
 */
public class Stringmethod2 {
    public static void main(String[] args) {
        System.out.println(String.valueOf(true)); //boolean
        System.out.println(String.valueOf('c')); //char
        System.out.println(String.valueOf(10)); //int
        System.out.println(String.valueOf(10.5d)); //double
        System.out.println("=======================");
        String s="                        Hello world        ";
        System.out.println(s.trim());
        
        String s1="welcome";
        //char ch[]={'w','e','e','c','o','m','e'};
        
        char mychar[]=s1.toCharArray();
        System.out.println(mychar[0]);
        
        System.out.println("===========");
        for(char ch:mychar){
            System.out.print(ch+", ");
        }
    }
}
