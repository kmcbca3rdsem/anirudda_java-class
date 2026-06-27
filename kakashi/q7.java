package kakashi;

import java.util.*;
public class q7 {
    static String longestWord(String s) {
        String[] words = s.split(" ");
        String max="";
        for(String w:words) if(w.length()>max.length()) max=w;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("Longest word: "+longestWord(s));
    }
}
