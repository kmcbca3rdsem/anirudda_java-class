package Assignment.Lab4;

class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}