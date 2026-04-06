package exam_practice.inheritance;
class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name; // 'this' refers to the current object's name
        this.age = age;   // 'this' refers to the current object's age
    }

    void display() {
        System.out.println("Name: " + this.name); // Using 'this' to access instance variable
        System.out.println("Age: " + this.age);   // Using 'this' to access instance variable
    }

}
public class thiskeyword {
    public static void main(String[] args) {
        // Example of using 'this' keyword
        Person p = new Person("Alice", 30);
        p.display();
    }

    
}
