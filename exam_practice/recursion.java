package exam_practice;
class fac{
    int fac(int n){
        if (n==1||n==0){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }
}
public class recursion {
    public static void main(String[] args) {
        fac f = new fac();
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + f.fac(n));
    } 
}
