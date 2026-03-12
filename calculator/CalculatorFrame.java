package calculator;
import java.awt.*;
import java.awt.event.*;

public class CalculatorFrame extends Frame implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div;

    CalculatorFrame() {
        setTitle("Simple Calculator");
        setSize(300, 250);
        setLayout(new FlowLayout());

        Label l1 = new Label("First Number:");
        Label l2 = new Label("Second Number:");
        Label l3 = new Label("Result:");

        t1 = new TextField(15);
        t2 = new TextField(15);
        result = new TextField(15);
        result.setEditable(false);

        add = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");

        add(l1); add(t1);
        add(l2); add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(l3); add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());
        double res = 0;

        if (e.getSource() == add)
            res = num1 + num2;
        else if (e.getSource() == sub)
            res = num1 - num2;
        else if (e.getSource() == mul)
            res = num1 * num2;
        else if (e.getSource() == div)
            res = num1 / num2;

        result.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new CalculatorFrame();
    }
}