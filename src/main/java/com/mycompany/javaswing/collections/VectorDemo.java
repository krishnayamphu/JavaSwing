/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

import java.util.Vector;

/**
 *
 * @author User
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> stdlist=new Vector<>();// generic type
        stdlist.add("Ram");
        stdlist.add("Hari");
        stdlist.add("Sita");
        
        for(String name:stdlist){
            System.out.println(name);
        }
    }
    
}
