package lab2;



class Person{
    String name;
    int age;

    void greet(){
        System.out.println("Hello, " +name+".");
        System.out.println("A "+age+" years old guy.");
    }
}

public class persondemo{
    public static void main(String[] args){
        Person p1=new Person();

        p1.name="Rohit";
        p1.age=20;

        p1.greet();
    }
}
