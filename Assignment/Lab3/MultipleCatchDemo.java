package Assignment.Lab3;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5};
        int a = 10;

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Result: " + a / numbers[i]);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds!");
            }
        }

        System.out.println("Program continues after multiple exception handling.");
    }
}