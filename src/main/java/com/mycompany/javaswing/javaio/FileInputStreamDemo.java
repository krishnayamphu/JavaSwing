package com.mycompany.javaswing.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream=new FileInputStream("C:\\test.txt");
           System.out.print((char)inputStream.read());
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
