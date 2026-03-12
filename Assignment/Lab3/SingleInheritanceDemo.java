package Assignment.Lab3;

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog1 extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog1 d = new Dog1();

        d.eat();
        d.bark();
    }
}