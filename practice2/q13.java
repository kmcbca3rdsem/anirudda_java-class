package practice2;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers separated by space: ");
        String input = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);
        String[] nums = sb.toString().split(" ");

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }

        System.out.println("Sum: " + sum);
    }
}
