package GUVI_CLASSTASKS.Task3.Question2;

// b. Create class Product and implement Taxable to calculate sales Tax on unit price of product

public class Product implements Taxable{
    int productID;
    double price;
    int quantity;

    public Product(int productID,double price,int quantity) {
        this.quantity = quantity;
        this.price = price;
        this.productID = productID;
    }

    @Override
    public double calcTax() {
        double salesTaxPrice=price*(salesTax/100);
        double productPrice=price-salesTaxPrice;
        System.out.println("Product price without tax = "+productPrice);
        double salesTaxPerUnit=salesTaxPrice/quantity;
        return salesTaxPerUnit;
    }
}