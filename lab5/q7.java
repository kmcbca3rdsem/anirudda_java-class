package lab5;

import javax.swing.*;
import java.awt.event.*;

public class q7 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mouse Event Example");
        f.setSize(300, 200);
        f.setLayout(null);

        JTextField t = new JTextField();
        t.setBounds(80, 20, 120, 30);

        JLabel l = new JLabel("Result:");
        l.setBounds(80, 120, 200, 30);

        JButton b = new JButton("Check");
        b.setBounds(80, 70, 120, 30);

        b.addMouseListener(new MouseAdapter() {

            // Click → Factorial
            public void mouseClicked(MouseEvent e) {
                int n = Integer.parseInt(t.getText());
                int fct = 1;
                for (int i = 1; i <= n; i++) {
                    fct *= i;
                }
                l.setText("Factorial: " + fct);
            }

            // Release → Cube
            public void mouseReleased(MouseEvent e) {
                int n = Integer.parseInt(t.getText());
                l.setText("Cube: " + (n * n * n));
            }
        });

        f.add(t);
        f.add(b);
        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}