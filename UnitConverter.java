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
        JTextField lbs = new JTectField(8);
        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel("Unit Converter/n/nRules: /n1)Only use positive numbers/n2)No Symbols"));
        add(new JLabel("Pounds"));
        add(lbs);
        while(again){
            valuelbs=lbs.getText();
        }    

    }

    public static void main(String[] args){
        UnitConverter pounds = new UnitConverter();
        UnitConverter kilograms = new UnitConverter();

        frame.setTitle("Unit Converter");
        frame.setSize(,);
        
    }
}
