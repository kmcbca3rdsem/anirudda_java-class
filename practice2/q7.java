package practice2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to count: ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(sentence);
        String[] words = sb.toString().split(" ");

        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}
