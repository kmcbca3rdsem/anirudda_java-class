package exam_practice.inheritance;

class Student {
    int roll;
    String name;

    // Constructor to initialize values
    Student() {
        roll = 45;
        name = "Anirudda";
    }

    void display() {
        System.out.println("My name is " + name);
    }
}

class er extends Student {
    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        er obj = new er();
        obj.show();
    }
}