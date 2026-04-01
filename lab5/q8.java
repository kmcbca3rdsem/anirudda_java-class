package lab5;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class q8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Form");
        f.setSize(350, 300);
        f.setLayout(null);

        // Name field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 120, 30);

        // Checkbox
        JCheckBox cb = new JCheckBox("Accept Terms");
        cb.setBounds(50, 80, 200, 30);

        // Button
        JButton btn = new JButton("Submit");
        btn.setBounds(100, 130, 120, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cb.isSelected()) {
                    try {
                        FileWriter fw = new FileWriter("student.txt", true);
                        fw.write("Name: " + nameField.getText() + "\n");
                        fw.close();
                        JOptionPane.showMessageDialog(f, "Saved Successfully");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Please accept terms first");
                }
            }
        });

        f.add(nameLabel);
        f.add(nameField);
        f.add(cb);
        f.add(btn);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}