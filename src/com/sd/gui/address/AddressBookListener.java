package com.sd.gui.address;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddressBookListener implements ActionListener{
   public void actionPerformed(ActionEvent e)
   {
    
     JButton b =(JButton)e.getSource(); 
     String cmd =e.getActionCommand();
     if(cmd.equals("Enter Record")){
        System.out.println("��ϵǾ����ϴ�");
            b.setText("saved");
     }}
}
   
 
