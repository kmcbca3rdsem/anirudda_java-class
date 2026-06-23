package practice2;

import java.util.Scanner;

class MyThread extends Thread {
    StringBuffer sb;
    char ch;

    MyThread(StringBuffer sb, char ch) {
        this.sb = sb;
        this.ch = ch;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sb.append(ch);
        }
    }
}

public class q11 {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();

        MyThread t1 = new MyThread(sb, 'A');
        MyThread t2 = new MyThread(sb, 'B');
        MyThread t3 = new MyThread(sb, 'C');

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final StringBuffer: " + sb.toString());
    }
}