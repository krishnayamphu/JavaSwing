/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.File;

/**
 *
 * @author User
 */
public class FileListDemo {
    public static void main(String[] args) {
        File f=new File("C:\\javaDocs");
        File[] list=f.listFiles();
        
        for(File file:list){
            if(file.isDirectory())
            System.out.println(file.getName());
        }
    }
}
