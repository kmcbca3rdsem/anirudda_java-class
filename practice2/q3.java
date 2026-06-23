package practice2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(a).append(" ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Fibonacci: " + sb.toString());
    }
}
