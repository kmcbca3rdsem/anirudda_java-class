package Assignment.Lab3;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("He is driving");
    }
}

public class VehicleCarDemo {
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.drive();
    }
}