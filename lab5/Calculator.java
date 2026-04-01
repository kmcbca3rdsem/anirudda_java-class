package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setSize(300, 300);

        // Grid layout (5 rows, 2 columns)
        f.setLayout(new GridLayout(5, 2));

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JLabel result = new JLabel("Result:");

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        // Operations
        add.addActionListener(e -> {
            int r = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            result.setText("Result: " + r);
        });

        sub.addActionListener(e -> {
            int r = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
            result.setText("Result: " + r);
        });

        mul.addActionListener(e -> {
            int r = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
            result.setText("Result: " + r);
        });

        div.addActionListener(e -> {
            int r = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
            result.setText("Result: " + r);
        });

        f.add(new JLabel("Num1:")); f.add(t1);
        f.add(new JLabel("Num2:")); f.add(t2);
        f.add(add); f.add(sub);
        f.add(mul); f.add(div);
        f.add(result);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}