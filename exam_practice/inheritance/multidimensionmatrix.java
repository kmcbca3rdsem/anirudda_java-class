package exam_practice.inheritance;
import java.util.Scanner;

class di {
    int[][] matrix;

    // Constructor to receive matrix
    di(int[][] matrix) {
        this.matrix = matrix;
    }

    // Display matrix
    void display() {
        System.out.println("Matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example logic: sum of all elements
    void sum() {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
        }
        System.out.println("Sum = " + total);
    }
}

public class multidimensionmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size input
        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Taking matrix input
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Passing to di class
        di obj = new di(matrix);

        // Calling logic methods
        obj.display();
        obj.sum();

        sc.close();
    }
}