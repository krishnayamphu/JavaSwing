/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.strings;

/**
 *
String comparison
==================
boolean    equals​(Object anObject)	
Compares this string to the specified object.
* 
boolean	equalsIgnoreCase​(String anotherString)	
Compares this String to another String, ignoring case considerations.
* 
int compareTo​(String anotherString)	
Compares two strings lexicographically.
*

int compareToIgnoreCase​(String str)	
Compares two strings lexicographically, ignoring case differences.

String concatenation
====================
String	concat​(String str)	
Concatenates the specified string to the end of this string.

String transform (Uppercase/Lowercase)
======================
String	toLowerCase()	
Converts all of the characters in this String to lower case using the rules of the default locale.
* 
String	toLowerCase​(Locale locale)	
Converts all of the characters in this String to lower case using the rules of the given Locale.
*/
public class StringComparison {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        String s3="Hello";
        String s4="world";
        
        String s5="APTECH";
        
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //false
        System.out.println(s1.equalsIgnoreCase(s3)); //true
        System.out.println(s2.equals(s4));//true
        System.out.println("===================");
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s4));
        System.out.println(s1.compareToIgnoreCase(s3));
        
        System.out.println("=====================");
        
        System.out.println(s1.concat(s2));
        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(" world").concat(" hi"));
        
        System.out.println("=======================");
        System.out.println(s1.toUpperCase());
        System.out.println(s5.toLowerCase());
    }
}
