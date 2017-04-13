package com.sd.gui.address;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class AddressBook {
   public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(8,2));
      f.getContentPane().add(panel);
      JLabel label1=new JLabel("Name");
      JLabel label2=new JLabel("Address");
      JLabel label3=new JLabel("City");
      JLabel label4=new JLabel("State");
      JLabel label5=new JLabel("Zip code");
      JLabel label6=new JLabel("Phone number");
      JLabel label7=new JLabel("Email");
      JTextField f1=new JTextField(20);
      JTextField f2=new JTextField(20);
      JTextField f3=new JTextField(20);
      JTextField f4=new JTextField(20);
      JTextField f5=new JTextField(20);
      JTextField f6=new JTextField(20);
      JTextField f7=new JTextField(20);
      JButton b1=new JButton("Enter Record");
      JButton b2=new JButton("Exit");
      b1.addActionListener(new AddressBookListener());//button에 등록-register
      //loose coupling 되어었는 걸 연결 시켜줌
       panel.add(label1);
       panel.add(f1);
       panel.add(label2);
       panel.add(f2);
       panel.add(label3);
       panel.add(f3);
       panel.add(label4);
       panel.add(f4);
       panel.add(label5);
       panel.add(f5);
       panel.add(label6);
       panel.add(f6);
       panel.add(label7);
       panel.add(f7);
       panel.add(b1);
       panel.add(b2);
        f.pack();
        f.setVisible(true);
    }   
}
      
      