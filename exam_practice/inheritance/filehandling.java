package exam_practice.inheritance;
import javax.swing.*;
import java.awt.event.*;

public class filehandling {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Even or Odd Checker");
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Label
        JLabel label = new JLabel("Enter Number:");
        label.setBounds(30, 30, 100, 25);
        frame.add(label);

        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(140, 30, 100, 25);
        frame.add(textField);

        // Button
        JButton button = new JButton("Check");
        button.setBounds(90, 70, 100, 30);
        frame.add(button);

        // Result Label
        JLabel result = new JLabel("");
        result.setBounds(90, 110, 150, 25);
        frame.add(result);

        // Button Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());

                    if (num % 2 == 0) {
                        result.setText("Even Number");
                    } else {
                        result.setText("Odd Number");
                    }
                } catch (Exception ex) {
                    result.setText("Invalid Input!");
                }
            }
        });

        // Frame Settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}