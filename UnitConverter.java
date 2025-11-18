///*
// * CSCI 185 M02
// * Fall 2025
// * M7: Develop More Advanced Java GUI Lab
// * Author: Benjamin Chau
// * Date: 11/18/2025
// */

import javax.swing.*;
import java.awt.*;

class UnitConverter extends JFrame{

    private String yourInput;
    private boolean again = true;
    private double valuelbs;

    public UnitConverter(){
        JTextField lbs = new JTextField(8);
        JButton stop = new JButton("Submit");
        setLayout(new GridLayout(2, 2, 5, 5));
        add(new JLabel("Unit Converter/n/nRules: /n1)Only use positive numbers/n2)No Symbols"));
        add(new JLabel(""));
        add(new JLabel("Pounds"));
        add(lbs);
        add(stop);
        while(again){
            valuelbs=lbs.getText();
        }    

    }

    public static void main(String[] args){
        UnitConverter frame = new UnitConverter();
        frame.setTitle("Unit Converter");
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
