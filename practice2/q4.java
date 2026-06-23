package practice2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        System.out.println("Result: " + sb.toString());
    }
}
