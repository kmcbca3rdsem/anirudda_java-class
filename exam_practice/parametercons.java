package exam_practice;

public class parametercons {
    int x,y;
    parametercons(int a,int b){
        y = a;
        x = b;
    }
        void show(){
            System.out.println(y + " " + x);
        }
    
}
class main{
    public static void main(String[] args){
        parametercons obj = new parametercons(10,20);
        obj.show();
    }
}