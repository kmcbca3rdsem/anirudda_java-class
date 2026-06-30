package kakashi.lab3;

import java.util.Scanner;

class Student {
    String name;
    int roll;
    int marks;

    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}

class Result {
    void calculateGrade(Student s) {
        if (s.marks >= 80) {
            System.out.println("Grade: A");
        } else if (s.marks >= 60) {
            System.out.println("Grade: B");
        } else if (s.marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}

public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number:");
        int roll = sc.nextInt();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        Student s = new Student(name, roll, marks);
        Result r = new Result();

        r.calculateGrade(s);
    }
}
