package com.sd.address;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Iterator;
 
public class AddressBook{
  public AddressBook(){
   
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(4,2));
    f.getContentPane().add(panel);
    JLabel label1=new JLabel("Name");
    JLabel label2=new JLabel("Address");
    
    JTextField f1=new JTextField(8);
    JTextField f2=new JTextField(30);
    
    JButton binsert=new JButton("Register");
    JButton bfindByName=new JButton("Find By Name");
    JButton bdelete=new JButton("Delete");
  
    JButton bfindAll=new JButton("Find All");
    binsert.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        PersonDAOImpl personDAOImpl = new PersonDAOImpl();
        PersonVO person = new PersonVO();
        
        String fname=f1.getText();
        String faddress=f2.getText();
        person.setName(fname);
        person.setAddress(faddress);
        personDAOImpl.insert(person);
        
      }
    });
    
     bdelete.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     { PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       //PersonVO person = new PersonVO();
       String fname=f1.getText();
       
       personDAOImpl.delete(fname);
       System.out.println("delete ...");
       
       
     }
     });
    
    bfindAll.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     { PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       PersonVO person = new PersonVO();
       List persons=personDAOImpl.findAll();
       Iterator iter=persons.iterator();
       while(iter.hasNext()) {
         person=(PersonVO)iter.next();
         System.out.println(person.toString());
       }

       
     }
     });
     
    bfindByName.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     { PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       PersonVO person = new PersonVO();
       String fname=f1.getText();
       
       person=personDAOImpl.findByName(fname);
       System.out.println("found by name... "+person);
       
     }
     });
      
      
    panel.add(label1);
    panel.add(f1);
    panel.add(label2);
    panel.add(f2);
    panel.add(binsert);
    panel.add(bdelete);
    panel.add(bfindByName);
    panel.add(bfindAll);
    f.pack();
    f.setVisible(true);
  } 
}
