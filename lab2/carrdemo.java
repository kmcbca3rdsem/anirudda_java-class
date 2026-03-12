package lab2;

class Circle{
    double radius;

    double area(){
        return 3.14*radius*radius;
    }

    double circumference(){
        return 2*3.14*radius;
    }

    void display(){
        System.out.println("Area: "+area());
        System.out.println("Circumference: "+circumference());
    }
}

public class carrdemo{
    public static void main(String[] args){
        Circle c1=new Circle();

        c1.radius=7;

        c1.display();
    }
}
