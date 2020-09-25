/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.collections;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
class Student{
    int age;
    String name;
    String grade;

    public Student(int age, String name, String grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }
    
}
public class LinkedListDemo {
    public static void main(String[] args) {
        List name=new LinkedList();
        
        name.add("Ramesh");
        name.add("Manita");
        
        for(Object ob:name){
            System.out.println("Name: "+ob);
        }
        
        List<Student> stdlist=new LinkedList<>();
        
        Student s=new Student(15,"Ram","10");
        
        stdlist.add(s);
        stdlist.add(new Student(16,"Sita","11"));
        
        for(Student student:stdlist){
            System.out.println("Name: "+student.name);
            System.out.println("Age: "+student.age);
            System.out.println("Grade"+student.grade);
        }
        
    }
  
}
