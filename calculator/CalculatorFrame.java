package calculator;
import java.awt.*;
import java.awt.event.*;

public class CalculatorFrame extends Frame implements ActionListener {

    TextField display;
    Button b[] = new Button[10];
    Button add, sub, mul, div, equal, clear;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    CalculatorFrame() {

        setTitle("Phone Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new TextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(5,4));

        for(int i=0;i<=9;i++) {
            b[i] = new Button(String.valueOf(i));
            b[i].addActionListener(this);
        }

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        equal = new Button("=");
        clear = new Button("C");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);

        p.add(b[7]); p.add(b[8]); p.add(b[9]); p.add(div);
        p.add(b[4]); p.add(b[5]); p.add(b[6]); p.add(mul);
        p.add(b[1]); p.add(b[2]); p.add(b[3]); p.add(sub);
        p.add(b[0]); p.add(clear); p.add(equal); p.add(add);

        add(p, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if(s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            display.setText(display.getText() + s);
        }

        else if(s.equals("C")) {
            display.setText("");
        }

        else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            operator = s.charAt(0);
            display.setText("");
        }

        else if(s.equals("=")) {
            num2 = Double.parseDouble(display.getText());

            switch(operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            display.setText(String.valueOf(result));
        }
    }

    public static void main(String args[]) {
        new Calculator();
    }
}