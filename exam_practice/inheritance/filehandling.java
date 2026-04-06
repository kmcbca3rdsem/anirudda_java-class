package exam_practice.inheritance;
import java.io.FileWriter;

public class filehandling {
    public static void main(){
        try {
            FileWriter f = new FileWriter("chat.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
