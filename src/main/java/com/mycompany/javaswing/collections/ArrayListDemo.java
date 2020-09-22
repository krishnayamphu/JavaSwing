/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List namelist=new ArrayList();// old way
        
        String s="Hari";
        namelist.add("Ram");
        namelist.add("Sita");
        namelist.add(s);
        namelist.add(10);
        
        Iterator itr=namelist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("=================");
        
        for(Object name:namelist){
            System.out.println(name); 
        }
        
        System.out.println("==================");
//        List<Type> obj=new Class<>(); 
        List<String> days=new ArrayList<>();
        days.add("sun");
        days.add("mon");
        days.add("Fri");
        
        for(String day:days){
            System.out.println(day);
        }
        System.out.println("===============");
        days.remove("Fri");
        
        for(String day:days){
            System.out.println(day);
        }
        
        System.out.println("===========");
        
        days.add("sat");
        for(String day:days){
            System.out.println(day);
        }
        
        
        
        
    }
   
}
