package kakashi;

import java.util.*;
public class q10 {
    static int findIndex(int[] arr,int target){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==target) return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        System.out.println("Enter target number:");
        int target=sc.nextInt();

        int result = findIndex(arr,target);

        if(result==-1)
            System.out.println("Not found");
        else
            System.out.println("Found at index: "+result);
    }
}