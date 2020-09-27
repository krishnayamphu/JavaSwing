/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> personlist=new HashMap<>();
        
        personlist.put("Ramesh", 40);
        personlist.put("Sita", 25);
        
        for(Map.Entry person : personlist.entrySet()){    
    System.out.println(person.getKey()+" -> "+person.getValue());    
   }  
        
        
    }
    
}
