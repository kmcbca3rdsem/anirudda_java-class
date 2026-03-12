package Assignment.Lab4;

class SleepDemoThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) {
        SleepDemoThread t = new SleepDemoThread();
        t.start();
    }
}