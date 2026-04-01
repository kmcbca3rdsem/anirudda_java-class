package lab5;

import javax.swing.*;

public class q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout Example");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("Username:");
        label.setBounds(50, 50, 100, 30);

        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 150, 30);

        JButton button = new JButton("Submit");
        button.setBounds(150, 100, 100, 30);

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}