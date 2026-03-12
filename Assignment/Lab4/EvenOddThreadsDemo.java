package Assignment.Lab4;

class EvenNumbersThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddNumbersThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOddThreadsDemo {
    public static void main(String[] args) {
        EvenNumbersThread evenThread = new EvenNumbersThread();
        OddNumbersThread oddThread = new OddNumbersThread();

        evenThread.start();
        oddThread.start();
    }
}