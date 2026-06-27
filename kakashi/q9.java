package kakashi;

import java.util.*;
public class q9 {
    static void average(int[][] marks) {
        for(int i=0;i<marks.length;i++){
            int sum=0;
            for(int j=0;j<marks[i].length;j++) sum+=marks[i][j];
            System.out.println("Student "+(i+1)+" average: "+(sum/(double)marks[i].length));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int students=sc.nextInt();

        System.out.println("Enter number of subjects:");
        int subjects=sc.nextInt();

        int[][] marks=new int[students][subjects];

        System.out.println("Enter marks:");
        for(int i=0;i<students;i++)
            for(int j=0;j<subjects;j++)
                marks[i][j]=sc.nextInt();

        average(marks);
    }
}
