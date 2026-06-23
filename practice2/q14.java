package practice2;

class SyncThread extends Thread {
    StringBuffer sb;
    String text;

    SyncThread(StringBuffer sb, String text) {
        this.sb = sb;
        this.text = text;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sb.append(text).append(" ");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

public class q14 {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();

        SyncThread t1 = new SyncThread(sb, "Thread1");
        SyncThread t2 = new SyncThread(sb, "Thread2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Output: " + sb.toString());
    }
}
