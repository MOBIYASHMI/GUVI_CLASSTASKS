package GUVI_CLASSTASKS.Task3.Question2;


// Create interface Taxable with members salesTax and incomeTax. Create abstract method calcTax

public interface Taxable {
    double salesTax=7;
    double incomeTax=10.5;

    abstract double calcTax();
}
