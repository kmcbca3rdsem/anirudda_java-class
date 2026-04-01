package lab5;

import javax.swing.*;
import java.awt.event.*;

public class q15 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Multiply & Divide");
        f.setSize(300, 200);
        f.setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(50, 20, 150, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(50, 60, 150, 30);

        JButton mul = new JButton("Multiply");
        mul.setBounds(50, 100, 100, 30);

        JButton div = new JButton("Divide");
        div.setBounds(160, 100, 100, 30);

        mul.addActionListener(e -> {
            int r = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
            JOptionPane.showMessageDialog(f, "Product: " + r);
        });

        div.addActionListener(e -> {
            int r = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
            JOptionPane.showMessageDialog(f, "Quotient: " + r);
        });

        f.add(t1); f.add(t2);
        f.add(mul); f.add(div);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}