package Assignment.Lab4;

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Thread");
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        HelloRunnable hr = new HelloRunnable();
        Thread t = new Thread(hr);
        t.start();
    }
}