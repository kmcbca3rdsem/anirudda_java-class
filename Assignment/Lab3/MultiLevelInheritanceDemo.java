package Assignment.Lab3;

class Person {
    void showPerson() {
        System.out.println("This is a Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("This is an Employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("This is a Manager");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}