///*
// * CSCI 185 M02
// * Fall 2025
// * M7: Develop More Advanced Java GUI Lab
// * Author: Benjamin Chau, Anthony Coates, Jeffrey Perez
// * Date: 11/18/2025
// */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class UnitConverter extends JFrame{

    private String yourInput;
    private double valuelbs, valuekg;

    public UnitConverter(){
        //Set up
        setLayout(new GridLayout(3, 2, 5, 5));
        JTextField yourInput = new JTextField(5);
        JTextField result = new JTextField(5);
        JButton convert = new JButton("Convert");
        JButton clear = new JButton("Clear");

        //front-end
        add(new JLabel("Rules: Only positive numbers, no symbols or letters"));
        add(new JLabel("")); // empty cell
        add(new JLabel("Pounds to be converted:"));
        add(yourInput);
        add(new JLabel("Kilograms after conversion:"));
        add(result);
        add(convert);
        add(clear);

        //Converter button
        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    valuelbs = Double.parseDouble(yourInput.getText());
                    if (valuelbs < 0) {
                        throw new IllegalArgumentException("Negative values not allowed");
                    }
                    valuekg = 0.453592 * valuelbs;
                    result.setText(valuekg+" kg");
                } catch (NumberFormatException err) {
                    JOptionPane.showMessageDialog(null, "Cannot use symbols or letters");
                } catch (IllegalArgumentException err) {
                    JOptionPane.showMessageDialog(null, err.getMessage());
                }
            }
        } );

        //Clear button
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                yourInput.setText("");
                result.setText("");
            }
        } );

    }

    public static void main(String[] args){
        UnitConverter frame = new UnitConverter();
        frame.setTitle("Unit Converter");
        frame.setSize(1000,500);
        frame.setVisible(true);
    }
}
