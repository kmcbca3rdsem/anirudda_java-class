package kakashi;
import java.util.*;
public class q5 {
    static int sumEven(int[] arr) {
        int sum=0;
        for(int n:arr) if(n%2==0) sum+=n;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        System.out.println("Sum of even numbers: "+sumEven(arr));
    }
}