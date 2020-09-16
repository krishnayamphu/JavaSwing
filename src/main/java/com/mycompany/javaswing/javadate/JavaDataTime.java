/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javadate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class JavaDataTime {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");  
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalDateTime current=LocalDateTime.now();
        System.out.println(current);
        System.out.println("=========");
        System.out.println(dtf.format(current));
        System.out.println(dtf1.format(current));
    }
}
