/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.strings;

/**
StringBuffer()	
Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
StringBuffer​(int capacity)	
Constructs a string buffer with no characters in it and the specified initial capacity.
StringBuffer​(CharSequence seq)	
Constructs a string buffer that contains the same characters as the specified CharSequence.
StringBuffer​(String str)	
Constructs a string buffer initialized to the contents of the specified string.
*
Methods
* =============
StringBuffer	append​(boolean b)	
Appends the string representation of the boolean argument to the sequence.
StringBuffer	append​(char c)	
Appends the string representation of the char argument to this sequence.
StringBuffer	append​(char[] str)	
Appends the string representation of the char array argument to this sequence.
StringBuffer	append​(char[] str, int offset, int len)	
Appends the string representation of a subarray of the char array argument to this sequence.
StringBuffer	append​(double d)	
Appends the string representation of the double argument to this sequence.
StringBuffer	append​(float f)	
Appends the string representation of the float argument to this sequence.
StringBuffer	append​(int i)	
Appends the string representation of the int argument to this sequence.
StringBuffer	append​(long lng)	
Appends the string representation of the long argument to this sequence.
StringBuffer	append​(CharSequence s)	
Appends the specified CharSequence to this sequence.
StringBuffer	append​(CharSequence s, int start, int end)	
Appends a subsequence of the specified CharSequence to this sequence.
StringBuffer	append​(Object obj)	
Appends the string representation of the Object argument.
StringBuffer	append​(String str)	
Appends the specified string to this character sequence.
StringBuffer	append​(StringBuffer sb)	
Appends the specified StringBuffer to this sequence.

* StringBuffer insert() method

* StringBuffer replace() method
*StringBuffer delete() method
 */
public class StringBufferDemo {
    public static void main(String[] args) {
       char ch[]={'a','e','i','o','u'};
       String s="hello";
       StringBuffer sb=new StringBuffer(s);
       
        System.out.println(sb);
        
        sb.append(ch);
        
        System.out.println(sb);
        sb.append(1000d);
        System.out.println(sb);
        
        StringBuffer sb1=new StringBuffer("hi");
        sb1.insert(2," admin");
        
        System.out.println(sb1);
      
        sb1.replace(0, 2, "hello");
        System.out.println(sb1);
        
        sb1.delete(8, 12);
        System.out.println(sb1);
        
        StringBuffer ss=new StringBuffer("welcome");
        System.out.println(ss.length());
        ss.deleteCharAt(0);
        System.out.println(ss);
        
        
    }
    
}
