/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

import java.util.LinkedHashSet;

class Employee{
    int age;
    String name, address;
    
    public Employee(int age,String name, String address){
        this.age=age;
        this.name=name;
        this.address=address;
        
    }
}
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        LinkedHashSet<Employee> emplist=new LinkedHashSet<>();
        
       Employee e1=new Employee(40,"Ramesh","Jawalakhel");
       Employee e2=new Employee(46,"Subash","Jawalakhel");
       Employee e3=new Employee(50,"Bikram","Lagankhel");
        
       emplist.add(e1);
       emplist.add(e2);
       emplist.add(e3);
       
        for(Employee e:emplist){
            System.out.println("Name:"+e.name);
            System.out.println("Age:"+e.age);
            System.out.println("Address:"+e.address);
            System.out.println("=====================");
        }
    }
}
