package lab1;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute its factorial: ");
        int number = sc.nextInt();
        sc.close();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = 1;

            for (int i = 1; i <= number; i++) {
                result *= i;
            }

            System.out.println("The factorial of " + number + " is: " + result);
        }
    }
}
