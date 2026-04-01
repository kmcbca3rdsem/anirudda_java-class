package lab5;
import javax.swing.*;
import java.awt.*;

public class q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 1));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JButton("Button 1"));
        panel1.add(new JButton("Button 2"));
        panel1.add(new JButton("Button 3"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JLabel("Enter Name:"));
        panel2.add(new JTextField(15));

        frame.add(panel1);
        frame.add(panel2);

        frame.setVisible(true);
    }
}