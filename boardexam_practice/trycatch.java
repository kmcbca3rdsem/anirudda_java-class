package boardexam_practice;

class student{
    int roll,marks;
    String name;
    void input(){
        System.out.println("enter the roll and name:");
    }}
class ankit extends student{
    void disp(){
        roll = 1;
        name =  "ani";marks = 67;
        System.out.println(roll+""+name+""+marks);
    }

}
class main{
    public static void main(String[] args){
        ankit r = new ankit();
        r.input();
        r.disp();
    }
}
