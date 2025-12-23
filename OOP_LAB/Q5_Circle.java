package OOP_LAB;

class Circle {
    double radius;

    void calculateArea() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    void calculateCircumference() {
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        c.calculateArea();
        c.calculateCircumference();
    }
}

