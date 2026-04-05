package exam_practice.inheritance;

public class student{
    int roll;
    String name;
    class Details{
      int roll = 45;
        String name = "Anirudda";
    }
    void display(){
        System.out.println("my name is " + name);
    }

}
class er extends student{
    void show(){
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
    

}
class main {
 public static void main(String[] args){
     er obj = new er();
     obj.show();
 }
}