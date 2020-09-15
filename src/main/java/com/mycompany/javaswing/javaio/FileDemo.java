
package com.mycompany.javaswing.javaio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDemo {
    public static void main(String[] args) {
        File f=new File("c:\\nepal.txt");
         
        boolean isFile=f.isFile();
        if(isFile){
            System.out.println(f.getName());
        }else{
            System.out.println("not type of file or maybe directory");
        }
        
        File ff=new File("c:\\javaDocs");
        if(ff.mkdir()){
            System.out.println("Directory is created");
        }else{
            System.out.println("Error in creating dir.");
        }
//        try {
//            f.createNewFile();
//            System.out.println("file created.");
//                
//               
//                    } catch (IOException ex) {
//            Logger.getLogger(FileDemo.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
 
}
