/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

import java.util.TreeSet;

/**
 *
 * @author User
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet fruitlist=new TreeSet();
        fruitlist.add("Apple");
        fruitlist.add("Banana");
        fruitlist.add("orange");
        fruitlist.add("Apple");
        
        for(Object fruit:fruitlist){
            System.out.println(fruit);
        }
    }
}
