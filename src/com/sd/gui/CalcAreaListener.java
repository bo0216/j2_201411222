package com.sd.gui;
import java.awt.event.*;
import javax.swing.*;

public class CalcAreaListener implements ActionListener{
   public void actionPerformed(ActionEvent e)//ActionListener���� �Դ�.
   {
     System.out.println("Hello");
     JButton b =(JButton)e.getSource(); 
     String cmd =e.getActionCommand();
     if(cmd.equals("���")){
        System.out.println("��� ��ư");
            b.setText("����߽��ϴ�");
     }
   }
}