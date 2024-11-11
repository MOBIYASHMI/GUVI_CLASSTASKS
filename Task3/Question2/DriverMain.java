package GUVI_CLASSTASKS.Task3.Question2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        // Employee information
        System.out.println("Enter Employee ID : ");
        int employeeID=obj.nextInt();
        System.out.println("Enter Employee name : ");
        String name= obj.next();
        System.out.println("Enter Employee yearly salary : ");
        double salary=obj.nextDouble();

        Taxable employee=new Employee(employeeID,name,salary);

        // Product information
        System.out.println("Enter product ID : ");
        int productID=obj.nextInt();
        System.out.println("Enter product total price : ");
        double price=obj.nextDouble();
        System.out.println("Enter quantity of product : ");
        int quantity=obj.nextInt();

        Taxable product=new Product(productID,price,quantity);

        System.out.println("Tax deducted = "+employee.calcTax());
        System.out.println("Taxable price per unit = "+product.calcTax());



    }
}
