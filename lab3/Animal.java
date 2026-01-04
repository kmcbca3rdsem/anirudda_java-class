package lab3;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public void birthday() {
        age += 1;
        System.out.println(
            "Happy Birthday " + name + "! You are now " + age + " years old."
        );
    }
}
