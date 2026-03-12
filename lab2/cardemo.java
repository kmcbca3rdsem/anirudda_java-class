package lab2;

class Car {
    String brand;
    String model;
    int year;

    void displayDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}

public class cardemo{
    public static void main(String[] args){
        Car c1=new Car();

        c1.brand="Ford";
        c1.model="Mustang";
        c1.year=2025;

        c1.displayDetails();
    }
}
