/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.strings;

/**
 *
 indexOf​(int ch)	
Returns the index within this string of the first occurrence of the specified character.
int	indexOf​(int ch, int fromIndex)	
Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
int	indexOf​(String str)	
Returns the index within this string of the first occurrence of the specified substring.
int	indexOf​(String str, int fromIndex)	
Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
 
 ===============
int	lastIndexOf​(int ch)	
Returns the index within this string of the last occurrence of the specified character.
int	lastIndexOf​(int ch, int fromIndex)	
Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
int	lastIndexOf​(String str)	
Returns the index within this string of the last occurrence of the specified substring.
int	lastIndexOf​(String str, int fromIndex)	
Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
 
 */
public class StringSearching {
    public static void main(String[] args) {
        String s="welcome admin";
        
        System.out.println(s.indexOf('w'));  //0
        System.out.println(s.indexOf('e'));  //1
        System.out.println(s.indexOf('e',2)); //6
        System.out.println(s.indexOf("admin")); //8
        
        System.out.println("=================");
        System.out.println(s.lastIndexOf('e'));  //6
        System.out.println(s.lastIndexOf("welcome"));
    }
}
