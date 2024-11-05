package GUVI_CLASSTASKS.Task2.Question2;
import java.util.Arrays;
import java.util.Scanner;

public class Mainclass {

    //b. to find PID of product with the highest price
    public void findmaxpricepid(int[][] productinfo){
        int pricecol=1;
        int max=productinfo[0][1]; // 100
        int pid=productinfo[0][0];
        for(int i=1;i<productinfo.length;i++){
            if(productinfo[i][pricecol]>max){
                max=productinfo[i][pricecol];
                pid=productinfo[i][0];
            }
        }
        System.out.println("b. PID of product with highest price : "+ pid);
        System.out.println();
    }

    // c. method to calculate and return the total amount spent on all products
    public int total(int[][] productinfo){
        int pricecol=1;
        int quantitycol=2;
        int sum=0;
        for(int i=0;i<productinfo.length;i++){
            int product=productinfo[i][pricecol]*productinfo[i][quantitycol];
            sum+=product;
            product=1;
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        int[][] productinfo=new int[5][3];

        // a. accept five product information from user and store in array
        Scanner obj=new Scanner(System.in);
        System.out.println("a. Enter 5 product information: id, price, quantity");
        int a=1;
        for(int i=0;i<5;i++){
            System.out.println("Enter product " + a +" id, price, quantity : ");
            a++;
            for(int j=0;j<3;j++){
                productinfo[i][j]=obj.nextInt();
            }
        }

        //b. to find PID of product with the highest price
        Mainclass ms=new Mainclass();
        ms.findmaxpricepid(productinfo);

        // c. method to calculate and return the total amount spent on all products
        System.out.println("c. Total amount spent on all products = "+  ms.total(productinfo));
        System.out.println();

        // calling the constructor
        int pid=0,price=0,quantity=0;// initialized constructor parameters
        for(int i=0;i< productinfo.length;i++){
            int j=0;
            while(j<productinfo[1].length){
                switch (j) {
                    case 0 -> pid = productinfo[i][j];
                    case 1 -> price = productinfo[i][j];
                    case 2 -> quantity = productinfo[i][j];
                }
                j++;
            }
            Product product=new Product(pid,price,quantity);//calling parameterized constructor
        }
    }
}
