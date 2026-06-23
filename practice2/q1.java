package practice2;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);

        System.out.println("Result: " + sb.toString());
    }
}