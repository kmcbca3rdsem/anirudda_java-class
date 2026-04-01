package lab5;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Example");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);

        JCheckBox terms = new JCheckBox("Accept Terms & Conditions");
        terms.setBounds(50, 100, 250, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(150, 150, 100, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(terms);
        frame.add(submit);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (terms.isSelected()) {
                    try {
                        FileWriter fw = new FileWriter("beathird.txt", true);
                        fw.write("Name: " + nameField.getText() + "\n");
                        fw.close();
                        JOptionPane.showMessageDialog(frame, "Data saved successfully!");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Please accept the terms and condition first");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
