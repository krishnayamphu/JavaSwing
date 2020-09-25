/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

import java.util.HashSet;

/**
 *
 * @author User
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> stdlist=new HashSet<>();
        
        stdlist.add("Mohan");
        stdlist.add("Ramesh");
        stdlist.add("Ramesh");
        
        System.out.println(stdlist);
        
        stdlist.remove("Mohan");
        
        System.out.println(stdlist);
        
    }
}
