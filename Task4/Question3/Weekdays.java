package GUVI_CLASSTASKS.Task4.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        String[] weekdays=new String[7];
        weekdays[0]="Sunday";
        weekdays[1]="Monday";
        weekdays[2]="Tuesday";
        weekdays[3]="Wednesday";
        weekdays[4]="Thursday";
        weekdays[5]="Friday";
        weekdays[6]="Saturday";

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the day position between the range 0-6: ");
        int dayPosition= obj.nextInt();
        try{
            System.out.println(weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Day position is not in range. "+e.getMessage());
        }
    }
}
