package exam_practice.inheritance;
class Anup{
    int a;
    String name;
    Anup(int a,String name){
        this.a = a;
        this.name = name;


    }
    void show(){
        System.err.println(this.a);
        System.err.println(this.name);
    }


}
public class thiskeyword {
    public static void main(String[] args) {
    
    Anup a = new Anup(12,"ani");
    a.show();
    }


    
}
