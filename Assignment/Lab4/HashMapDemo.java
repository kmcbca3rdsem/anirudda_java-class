package Assignment.Lab4;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Alex");
        studentMap.put(102, "Dipesh");
        studentMap.put(103, "Supreme");
        studentMap.put(104, "Aniruddha");
        studentMap.put(105, "Matrix");

        System.out.println("Student ID and Name:");
        for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}