package lab5;

import javax.swing.*;
import java.awt.event.*;

public class q12 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Survey");
        f.setSize(350, 300);
        f.setLayout(null);

        // Food checkboxes
        JCheckBox pizza = new JCheckBox("Pizza");
        pizza.setBounds(50, 30, 100, 30);

        JCheckBox burger = new JCheckBox("Burger");
        burger.setBounds(50, 60, 100, 30);

        JCheckBox momo = new JCheckBox("Momo");
        momo.setBounds(50, 90, 100, 30);

        // Meal type radio buttons
        JRadioButton veg = new JRadioButton("Veg");
        veg.setBounds(200, 30, 100, 30);

        JRadioButton nonveg = new JRadioButton("Non-Veg");
        nonveg.setBounds(200, 60, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(veg);
        bg.add(nonveg);

        JButton submit = new JButton("Submit");
        submit.setBounds(100, 150, 120, 30);

        submit.addActionListener(e -> {
            String food = "";
            if (pizza.isSelected()) food += "Pizza ";
            if (burger.isSelected()) food += "Burger ";
            if (momo.isSelected()) food += "Momo ";

            String meal = veg.isSelected() ? "Veg" : "Non-Veg";

            JOptionPane.showMessageDialog(f, "Food: " + food + "\nMeal: " + meal);
        });

        f.add(pizza); f.add(burger); f.add(momo);
        f.add(veg); f.add(nonveg);
        f.add(submit);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
