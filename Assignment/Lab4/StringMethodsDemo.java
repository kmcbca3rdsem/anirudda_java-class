package Assignment.Lab4;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Rohit Shah";

        int length = text.length();
        System.out.println("Length of the string: " + length);

        String upperCaseText = text.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseText);

        String subText = text.substring(0,5); // Extracts substring from index 7 to 13
        System.out.println("Substring: " + subText);
    }
}