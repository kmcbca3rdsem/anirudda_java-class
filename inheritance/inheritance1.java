package inheritance;  
class Animal{
    void eat(){
        System.out.println("animal eat food");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("dog bark");
    }
}
public class inheritance1 {
    public void main(String[] args) {
       dog d = new dog();
       d.eat();
       d.bark();

    }
}
