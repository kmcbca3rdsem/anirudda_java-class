package OOP_LAB;

class Person {
    String name;
    int age;

    void greet() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Aniruddha";
        p.age = 20;

        p.greet();
    }
}
