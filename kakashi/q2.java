package kakashi;

import java.util.*;
public class q2 {
    static void result(int[] marks) {
        int sum = 0;
        for(int m : marks) sum += m;
        double per = sum / 5.0;
        String grade;
        if(per>=80) grade="A";
        else if(per>=60) grade="B";
        else if(per>=50) grade="C";
        else grade="Fail";
        System.out.println("Percentage: "+per);
        System.out.println("Grade: "+grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i=0;i<5;i++) marks[i]=sc.nextInt();
        result(marks);
    }
}
