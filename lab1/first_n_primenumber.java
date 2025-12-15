package lab1;

import java.util.Scanner;

public class first_n_primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many prime numbers you want: ");
        int n = sc.nextInt();

        int count = 0;   // counts prime numbers found
        int num = 2;     // number to check

        System.out.println("First " + n + " prime numbers are:");

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        sc.close();
    }
}
