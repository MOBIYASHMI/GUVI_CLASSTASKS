package GUVI_CLASSTASKS.Task1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        int total=obj.nextInt();
        int discount=0;
        if(total<500){
            System.out.println("0% DISCOUNT");
            System.out.println("Total after discount = "+total);
        } else if (total>500 && total<1000) {
            System.out.println("10% DISCOUNT");
            discount=total*10/100;
            System.out.println("Total after discount = "+(total-discount));
        } else{
            System.out.println("20% DISCOUNT");
            discount=total*20/100;
            System.out.println("Total after discount = "+(total-discount));
        }
    }
}
