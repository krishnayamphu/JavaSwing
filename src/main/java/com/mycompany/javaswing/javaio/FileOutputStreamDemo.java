/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaswing.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
FileOutputStream(File file)
Creates a file output stream to write to the file represented by the specified File object.
FileOutputStream(File file, boolean append)
Creates a file output stream to write to the file represented by the specified File object.
FileOutputStream(FileDescriptor fdObj)
Creates a file output stream to write to the specified file descriptor, which represents an existing connection to an actual file in the file system.
FileOutputStream(String name)
Creates a file output stream to write to the file with the specified name.
FileOutputStream(String name, boolean append)
Creates a file output stream to write to the file with the specified name.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("c:\\test.txt");
            fout.write(97);
            System.out.println("data write success");
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileOutputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
