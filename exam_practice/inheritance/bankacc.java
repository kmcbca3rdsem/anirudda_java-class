package exam_practice.inheritance;
import java.util.Scanner;
class ba{
        private String accnumber;
    private String name;
    private double blc;
    ba(){
        accnumber = "1234";
        name = "hari";
        blc = 45000;

    }
    void display(){

    }
}
public class bankacc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("want to add or withdraw: ");
        String a = sc.next();
        if (a =="add"){
                System.out.println("enter the accnumber: ");
                System.out.println("enter the name: ");
                System.out.println("enter the amount: ");
                

        }
        else if (a =="withdraw"){
                System.out.println("enter the accnumber: ");
                System.out.println("enter the name: ");
                System.out.println("enter the amount: ");

        }
        else{
            System.out.println("invalid input");
        }   

      
      

    }

}

