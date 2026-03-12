package Assignment.Lab4;

class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

class NumberProcessor {
    void checkPositive(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative number not allowed: " + number);
        } else {
            System.out.println("Number is positive: " + number);
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        try {
            processor.checkPositive(10);
            processor.checkPositive(-5);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}