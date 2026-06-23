package practice2;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first sentence: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second sentence: ");
        String s2 = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        sb.append(s1).append(" ").append(s2);

        System.out.println("Result: " + sb.toString());
    }
}