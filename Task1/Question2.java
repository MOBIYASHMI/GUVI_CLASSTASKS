package GUVI_CLASSTASKS.Task1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num=obj.nextInt();
        if(num>=0){
            System.out.println("Positive number");
        }else{
            System.out.println("Negative number");
        }
    }
}
