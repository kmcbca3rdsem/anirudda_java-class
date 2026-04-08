package exam_practice.inheritance;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String data = "";

        try {
            // 1. Read from input file
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                data += line + "\n";  // store each line in data variable
            }
            br.close();

            // 2. Write data to output file
            FileWriter fw = new FileWriter("output.txt");
            fw.write(data);  // write the data variable content
            fw.close();

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e);
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e);
        }
    }
}