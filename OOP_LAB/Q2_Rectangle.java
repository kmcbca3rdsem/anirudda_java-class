package OOP_LAB;

class Rectangle {
    double length;
    double width;

    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 10;
        rect.width = 5;

        rect.calculateArea();
        rect.calculatePerimeter();
    }
}

