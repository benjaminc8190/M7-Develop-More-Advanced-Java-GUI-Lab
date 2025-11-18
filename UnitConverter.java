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
    private double valuelbs, valuekg;

    public UnitConverter(){
        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel("Rules: Only positive numbers, no symbols or letters"));
        add(new JLabel("")); // empty cell

        yourInput=JOptionPane.showInputDialog("Enter pounds:");
        try {
            valuelbs=Double.parseDouble(yourInput);
            if (valuelbs < 0) {
                throw new IllegalArgumentException("Negative values not allowed");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Cannot use symbols or letters");
        } catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        valuekg=0.453592*valuelbs;

        add(new JLabel("Pounds:"));
        add(new JLabel(valuelbs+" lbs"));

        add(new JLabel("Kilograms"));
        add(new JLabel(valuekg+" kg"));
    }

    public static void main(String[] args){
        UnitConverter frame = new UnitConverter();
        frame.setTitle("Unit Converter");
        frame.setSize(1000,500);
        frame.setVisible(true);
    }
}
