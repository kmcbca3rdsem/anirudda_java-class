package lab2;


class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        int r = real + c.real;
        int i = imag + c.imag;
        return new Complex(r, i);
    }

    Complex subtract(Complex c) {
        int r = real - c.real;
        int i = imag - c.imag;
        return new Complex(r, i);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class complexdemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, 1);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Addition: ");
        sum.display();

        System.out.print("Subtraction: ");
        diff.display();
    }
}
