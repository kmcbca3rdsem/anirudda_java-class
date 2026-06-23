package practice2;

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (comma separated): ");
        String input = sc.nextLine();

        String[] nums = input.split(",");
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i].trim());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num).append(",");
        }

        System.out.println("Sorted: " + sb.substring(0, sb.length() - 1));
    }
}
