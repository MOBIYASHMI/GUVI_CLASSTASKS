package GUVI_CLASSTASKS.Task2.Question4;

import java.util.Scanner;

public class Employee extends Person{
    int employeeID;
    int salary;
    public Employee(String name,int age){
        super(name, age);
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Mobiyashmi",24);
        System.out.println("Name = " + employee.name);
        System.out.println("age = " + employee.age);
    }
}
