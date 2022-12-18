package Swing;

import javax.swing.*;

public class javaLabelBtn {
    public static void main(String[] args ){
        JFrame f=new JFrame("java label buttton example");
        JLabel l1,l2;
        l1=new JLabel("Btn 1");
        l2=new JLabel("Btn 2");
        l1.setBounds(50,50, 100,30);
        l2.setBounds(50,100, 100,30);
        f.add(l1);
        f.add(l2);
        f.setSize(300 ,300);
        f.setLayout(null);
        f.setVisible(true);


    }
}
