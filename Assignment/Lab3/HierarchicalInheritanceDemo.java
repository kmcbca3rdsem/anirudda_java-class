package Assignment.Lab3;

class Animal2 {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal2 {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}