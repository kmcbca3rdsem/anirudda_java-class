package Assignment.Lab4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("OutputFile.txt");
            FileOutputStream outputStream = new FileOutputStream("DemoFile.txt");

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File content copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copying.");
            e.printStackTrace();
        }
    }
}