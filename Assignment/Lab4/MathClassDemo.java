package Assignment.Lab4;

public class MathClassDemo {
    public static void main(String[] args) {
        double number = 16;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + ": " + squareRoot);

        double base = 2;
        double exponent = 3;
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + ": " + power);

        double randomValue = Math.random();
        System.out.println("Random number between 0 and 1: " + randomValue);
    }
}