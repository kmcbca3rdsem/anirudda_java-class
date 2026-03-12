package Assignment.Lab4;

import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Alex");
        students.add("Dipesh");
        students.add("Supreme");
        students.add("Aniruddha");
        students.add("Matrix");

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}