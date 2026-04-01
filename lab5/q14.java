package lab5;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class q14 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Register");
        f.setSize(350, 300);
        f.setLayout(null);

        JTextField name = new JTextField();
        name.setBounds(120, 20, 150, 30);

        JTextField email = new JTextField();
        email.setBounds(120, 60, 150, 30);

        JPasswordField pass1 = new JPasswordField();
        pass1.setBounds(120, 100, 150, 30);

        JPasswordField pass2 = new JPasswordField();
        pass2.setBounds(120, 140, 150, 30);

        JButton btn = new JButton("Register");
        btn.setBounds(100, 200, 120, 30);

        btn.addActionListener(e -> {
            String p1 = new String(pass1.getPassword());
            String p2 = new String(pass2.getPassword());

            if (p1.equals(p2)) {
                try {
                    FileWriter fw = new FileWriter("user.txt", true);
                    fw.write(name.getText() + "," + email.getText() + "\n");
                    fw.close();
                    JOptionPane.showMessageDialog(f, "Registered Successfully");
                } catch (Exception ex) {}
            } else {
                JOptionPane.showMessageDialog(f, "Passwords do not match");
            }
        });

        f.add(new JLabel("Name:")).setBounds(30, 20, 100, 30);
        f.add(name);
        f.add(new JLabel("Email:")).setBounds(30, 60, 100, 30);
        f.add(email);
        f.add(new JLabel("Password:")).setBounds(30, 100, 100, 30);
        f.add(pass1);
        f.add(new JLabel("Confirm:")).setBounds(30, 140, 100, 30);
        f.add(pass2);
        f.add(btn);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}