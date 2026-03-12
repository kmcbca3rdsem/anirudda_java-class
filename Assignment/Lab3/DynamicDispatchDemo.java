package Assignment.Lab3;

class Device {
    void showType() {
        System.out.println("This is a generic device");
    }
}

class Smartphone extends Device {
    @Override
    void showType() {
        System.out.println("This is a smartphone");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {

        Device d;
        d = new Smartphone();

        d.showType();
    }
}