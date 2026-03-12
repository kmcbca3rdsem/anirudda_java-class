package Assignment.Lab3;

interface Drawable {
    void draw();
}

class CircleShape implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class SquareShape implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class DrawableDemo {
    public static void main(String[] args) {
        CircleShape c = new CircleShape();
        SquareShape s = new SquareShape();

        c.draw();
        s.draw();
    }
}