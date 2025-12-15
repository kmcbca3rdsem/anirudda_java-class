package lab1;

public class sum_odd {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                sum += i;
            }
        }

        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
    }
    
}
