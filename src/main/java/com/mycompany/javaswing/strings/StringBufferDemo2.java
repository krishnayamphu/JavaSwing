/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.strings;

/**
 *
StringBuffer reverse() method
The reverse() method of StringBuilder class reverses the current string.
* 
StringBuffer capacity() method
The capacity() method of StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
 */
public class StringBufferDemo2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
    }
}
