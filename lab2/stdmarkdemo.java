package lab2;


class StudentMarks {
    String name;
    int roll;
    int[] marks;

    StudentMarks(String n, int r, int[] m) {
        name = n;
        roll = r;
        marks = m;
    }

    int total() {
        int sum = 0;
        for(int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum;
    }

    double average() {
        return (double) total() / marks.length;
    }

    void display() {
        System.out.println("Name: " + name +"\nRoll: " + roll+"\nTotal: " + total()+ "\nAverage: " + average());

    }
}

public class stdmarkdemo {
    public static void main(String[] args) {

        int[] m = {78, 85, 90, 88, 76};

        StudentMarks s1 = new StudentMarks("Alex", 12, m);

        s1.display();
    }
}
