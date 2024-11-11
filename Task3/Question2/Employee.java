package GUVI_CLASSTASKS.Task3.Question2;

public class Employee implements Taxable {
    int employeeID;
    String name;
    double salary;

    public Employee(int employeeID,String name,double salary){
        this.employeeID=employeeID;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public double calcTax() {
        double taxDeductable=salary*(incomeTax/100);
        double grossSalary=salary-taxDeductable;
        System.out.println("Gross Salary = "+grossSalary);
        return taxDeductable;
    }
}