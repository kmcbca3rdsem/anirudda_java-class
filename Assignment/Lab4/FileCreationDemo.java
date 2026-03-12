package Assignment.Lab4;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo {
    public static void main(String[] args) {
        File file = new File("DemoFile.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}