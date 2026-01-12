package lab3.services.distance;

public class Distance {
    private int feet;
    private int inches;

    // Constructor
    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    // Parameterized constructor
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        normalizeDistance();
    }

    // Add distance
    public Distance addDistance(Distance d) {
        Distance result = new Distance();
        result.feet = this.feet + d.feet;
        result.inches = this.inches + d.inches;
        result.normalizeDistance();
        return result;
    }

    // Subtract distance
    public Distance subtractDistance(Distance d) {
        Distance result = new Distance();
        result.feet = this.feet - d.feet;
        result.inches = this.inches - d.inches;
        result.normalizeDistance();
        return result;
    }

    // Normalize inches to feet
    private void normalizeDistance() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
        if (inches < 0) {
            feet--;
            inches += 12;
        }
    }

    // Display distance
    public void dispDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}
