package poly;
class animal{
    void eat(){
        System.out.println("animal eat food");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("dog eat dog food");
    }
}
class cat extends animal{
    void eat(){
        System.out.println("cat eat cat food");
    }
}
public class polymorphism {
    public static void main(String[] args) {
    animal a = new animal()  ;
    animal d = new dog()  ;
    animal c = new cat()  ;
    a.eat();
    d.eat();
    c.eat();      
    }
}
