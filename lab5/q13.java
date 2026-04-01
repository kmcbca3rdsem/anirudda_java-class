package lab5;

import javax.swing.*;
import java.awt.event.*;

public class q13 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        JLabel u = new JLabel("Username:");
        u.setBounds(30, 30, 100, 30);
        JTextField user = new JTextField();
        user.setBounds(120, 30, 120, 30);

        JLabel p = new JLabel("Password:");
        p.setBounds(30, 70, 100, 30);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(120, 70, 120, 30);

        JButton btn = new JButton("Login");
        btn.setBounds(80, 120, 120, 30);

        btn.addActionListener(e -> {
            String username = user.getText();
            String password = new String(pass.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(f, "Welcome Admin!");
            } else {
                JOptionPane.showMessageDialog(f, "Error: Invalid Login");
            }
        });

        f.add(u); f.add(user);
        f.add(p); f.add(pass);
        f.add(btn);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}