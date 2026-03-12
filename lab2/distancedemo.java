package lab2;



class Distance{
    int feet;
    int inches;

    Distance(int f, int i){
        feet=f;
        inches=i;
    }
    Distance add(Distance d){
        int f=feet+d.feet;
        int i=inches+d.inches;

        if(i>=12){
            f++;
            i=i-12;
        }

        return new Distance(f,i);
    }

    Distance subtract(Distance d){
        int f=feet-d.feet;
        int i=inches-d.inches;

        if(i<0){
            f--;
            i=i+12;
        }
        return new Distance(f,i);

    }

    void display(){
        System.out.println(feet+" feet "+inches+" inches");
    }
}

public class distancedemo {
    public static void main(String[] args){
        Distance d1=new Distance(5,8);
        Distance d2= new Distance(3,10);

        Distance sum=d1.add(d2);
        Distance diff=d1.subtract(d2);

        System.out.println("Add:");
        sum.display();
        System.out.println("Sub:");
        diff.display();

    }
}