package com.mycompany.javaswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class JavaSwing extends JFrame implements ActionListener{
    JLabel lbltext;
    JButton btnok;
    public JavaSwing(){
        setVisible(true);
        setSize(400,300);
        setLayout(new FlowLayout());
        
        lbltext=new JLabel();
        btnok=new JButton("OK");
        
        add(lbltext);
        add(btnok);
        btnok.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new JavaSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnok){
           lbltext.setText("Hello World");
       }
    }
    
}
