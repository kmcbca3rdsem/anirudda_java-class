package lab2;




class Student{
    int rollNumber;
    String name;
    double marks;

    void passfail(double marks){
        if(marks>24){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }


    void display(){
        System.out.println("Total Marks: " + marks);

        double percentage= (marks/60)*100;
        System.out.printf("Percentage:%.2f%% ", percentage);


    }
}

public class stddem {
    public static void main(String[] args){
        Student st1=  new Student();


        st1.name="Rohit Shah";
        st1.rollNumber=26;
        st1.marks=59;


        st1.passfail(st1.marks);
        st1.display();
    }
}
