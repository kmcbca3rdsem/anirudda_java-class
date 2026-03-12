package Assignment.Lab3;

import java.io.IOException;

class FileHandler {
    void readFile(String filename) throws IOException {
        if (!filename.equals("data.txt")) {
            throw new IOException("File not found: " + filename);
        } else {
            System.out.println("File " + filename + " read successfully.");
        }
    }
}

public class ThrowsKeywordDemo {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        try {
            fh.readFile("test.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            fh.readFile("data.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}