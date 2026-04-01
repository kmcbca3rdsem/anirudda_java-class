package calculator;
import javax.swing.*;
import java.awt.event.*;

public class SquareCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Calculator");
        frame.setSize(350, 200);
        frame.setLayout(null);

        // Input field
        JTextField inputField = new JTextField();
        inputField.setBounds(50, 20, 200, 30);

        // Button
        JButton button = new JButton("Calculate Square");
        button.setBounds(80, 60, 180, 30);

        // Label
        JLabel label = new JLabel("Square of entered number:");
        label.setBounds(20, 110, 200, 30);

        // Output field
        JTextField outputField = new JTextField();
        outputField.setBounds(220, 110, 80, 30);

        // Button Action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField.getText());
                    int square = num * num;
                    outputField.setText(String.valueOf(square));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Enter a valid number");
                }
            }
        });

        // Add components
        frame.add(inputField);
        frame.add(button);
        frame.add(label);
        frame.add(outputField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
