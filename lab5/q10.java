package lab5;

import javax.swing.*;
import java.awt.event.*;

public class q10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Marks");
        f.setSize(350, 300);
        f.setLayout(null);

        // Name input
        JLabel nameL = new JLabel("Name:");
        nameL.setBounds(50, 20, 100, 30);
        JTextField nameF = new JTextField();
        nameF.setBounds(150, 20, 120, 30);

        // Marks inputs
        JTextField m1 = new JTextField();
        m1.setBounds(150, 60, 120, 30);
        JLabel l1 = new JLabel("Sub1:");
        l1.setBounds(50, 60, 100, 30);

        JTextField m2 = new JTextField();
        m2.setBounds(150, 100, 120, 30);
        JLabel l2 = new JLabel("Sub2:");
        l2.setBounds(50, 100, 100, 30);

        JTextField m3 = new JTextField();
        m3.setBounds(150, 140, 120, 30);
        JLabel l3 = new JLabel("Sub3:");
        l3.setBounds(50, 140, 100, 30);

        // Result label
        JLabel result = new JLabel("Result:");
        result.setBounds(50, 220, 250, 30);

        // Button
        JButton btn = new JButton("Calculate");
        btn.setBounds(100, 180, 120, 30);

        btn.addActionListener(e -> {
            int total = Integer.parseInt(m1.getText()) +
                        Integer.parseInt(m2.getText()) +
                        Integer.parseInt(m3.getText());

            double avg = total / 3.0;

            result.setText("Total: " + total + " Avg: " + avg);
        });

        f.add(nameL); f.add(nameF);
        f.add(l1); f.add(m1);
        f.add(l2); f.add(m2);
        f.add(l3); f.add(m3);
        f.add(btn); f.add(result);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}