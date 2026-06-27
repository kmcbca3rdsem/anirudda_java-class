package kakashi;

import java.util.*;
public class q6 {
    static boolean login(String u, String p) {
        return u.equals("admin") && p.equals("1234");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String u=sc.next();

        System.out.println("Enter password:");
        String p=sc.next();

        if(login(u,p))
            System.out.println("Login Successful");
        else
            System.out.println("Login Failed");
    }
}
