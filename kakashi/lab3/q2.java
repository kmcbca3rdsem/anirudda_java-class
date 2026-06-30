package kakashi.lab3;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
    int years;

    Employee(int id, String name, double salary, int years) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.years = years;
    }
}

class Company {
    void increaseSalary(Employee emp) {
        if (emp.years > 5) {
            emp.salary = emp.salary + (emp.salary * 0.10);
        }
        System.out.println("Updated Salary: " + emp.salary);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter Years of Work:");
        int years = sc.nextInt();

        Employee emp = new Employee(id, name, salary, years);
        Company c = new Company();

        c.increaseSalary(emp);
    }
}
