package Assignment.Lab3;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.draw();
    }
}