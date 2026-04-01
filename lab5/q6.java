package lab5;

import javax.swing.*;
import java.awt.event.*;

public class q6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial & Cube");
        frame.setSize(350, 250);
        frame.setLayout(null);

        // Input field
        JTextField input = new JTextField();
        input.setBounds(100, 30, 120, 30);

        // Label for output
        JLabel result = new JLabel("Result:");
        result.setBounds(100, 120, 200, 30);

        // Button
        JButton button = new JButton("Result");
        button.setBounds(100, 70, 120, 30);

        // Mouse events
        button.addMouseListener(new MouseAdapter() {

            // When mouse is pressed → Factorial
            public void mousePressed(MouseEvent e) {
                int num = Integer.parseInt(input.getText());
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                result.setText("Factorial: " + fact);
            }

            // When mouse is released → Cube
            public void mouseReleased(MouseEvent e) {
                int num = Integer.parseInt(input.getText());
                int cube = num * num * num;
                result.setText("Cube: " + cube);
            }
        });

        frame.add(input);
        frame.add(button);
        frame.add(result);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
