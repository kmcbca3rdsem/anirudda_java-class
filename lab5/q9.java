package lab5;

import javax.swing.*;
import java.awt.event.*;

public class q9 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Rectangle Calculator");
        f.setSize(350, 300);
        f.setLayout(null);

        // Length input
        JLabel l1 = new JLabel("Length:");
        l1.setBounds(50, 30, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 120, 30);

        // Breadth input
        JLabel l2 = new JLabel("Breadth:");
        l2.setBounds(50, 70, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 70, 120, 30);

        // Output label
        JLabel result = new JLabel("Result:");
        result.setBounds(50, 180, 250, 30);

        // Area button
        JButton areaBtn = new JButton("Area");
        areaBtn.setBounds(50, 120, 100, 30);

        // Perimeter button
        JButton periBtn = new JButton("Perimeter");
        periBtn.setBounds(170, 120, 100, 30);

        // Area calculation
        areaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int l = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int area = l * b;
                result.setText("Area: " + area);
            }
        });

        // Perimeter calculation
        periBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int l = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int peri = 2 * (l + b);
                result.setText("Perimeter: " + peri);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(areaBtn);
        f.add(periBtn);
        f.add(result);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}