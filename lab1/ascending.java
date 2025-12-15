package lab1;

import java.util.Scanner;

public class ascending {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;               // Fixed to 5 numbers
        int[] arr = new int[n];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting logic (ascending order)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Numbers in Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
