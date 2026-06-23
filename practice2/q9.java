package practice2;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, Character.toUpperCase(ch));
        }

        System.out.println("Uppercase: " + sb.toString());
    }
}
