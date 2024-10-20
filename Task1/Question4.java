package GUVI_CLASSTASKS.Task1;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a<b && a<c){
            System.out.println("Smallest number is a : "+a);
        }else if(b<a && b<c){
            System.out.println("Smallest number is b : "+b);
        }else{
            System.out.println("Smallest number is c : "+c);
        }
    }
}
