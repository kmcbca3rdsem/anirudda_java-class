package Assignment.Lab4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("OutputFile.txt");
            writer.write("Rohit Shah");
            writer.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}