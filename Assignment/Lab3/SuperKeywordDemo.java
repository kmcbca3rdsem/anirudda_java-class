package Assignment.Lab3;

class Animal3 {
    Animal3() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog3 extends Animal3 {

    Dog3() {
        super();
        System.out.println("Dog constructor called");
    }

    void show() {
        super.eat();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {

        Dog3 d = new Dog3();
        d.show();
    }
}