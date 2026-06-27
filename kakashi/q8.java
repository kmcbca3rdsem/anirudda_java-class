package kakashi;

import java.util.*;
public class q8 {
    static boolean isArmstrong(int n) {
        int temp=n,sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        return sum==temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        if(isArmstrong(n))
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
