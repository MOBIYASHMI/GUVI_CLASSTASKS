package GUVI_CLASSTASKS.Task3.Question2;

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
        double unitPrice=price/quantity;
        double unitPriceTax=unitPrice*(salesTax/100);
        System.out.println("Unit price = "+unitPrice);
        return unitPriceTax;
    }
}
