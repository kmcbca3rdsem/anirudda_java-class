package lab3.services.distance;

public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8);
        Distance d2 = new Distance(3, 11);

        Distance d3 = d1.addDistance(d2);
        System.out.print("After Addition: ");
        d3.dispDistance();

        Distance d4 = d1.subtractDistance(d2);
        System.out.print("After Subtraction: ");
        d4.dispDistance();
    }
}
