package Assignment.Lab4;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int result = numbers[10];  // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Element at index 10: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds! " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block will execute no matter what.");
        }
    }
}