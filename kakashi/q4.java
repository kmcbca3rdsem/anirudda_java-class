package kakashi;

import java.util.*;
public class q4 {
    static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
