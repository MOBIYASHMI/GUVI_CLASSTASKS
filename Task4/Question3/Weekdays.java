package GUVI_CLASSTASKS.Task4.Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {

        // store weekdays in an array
        String[] weekdays=new String[7];
        weekdays[0]="Sunday";
        weekdays[1]="Monday";
        weekdays[2]="Tuesday";
        weekdays[3]="Wednesday";
        weekdays[4]="Thursday";
        weekdays[5]="Friday";
        weekdays[6]="Saturday";

        // get day position from user and print day name
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the day position between the range 0-6: ");
        int dayPosition= obj.nextInt();

        try{
            System.out.println(weekdays[dayPosition]); // handle Array IndexOut Of Bounds Exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Day position is not in range. "+e.getMessage());
        }
    }
}
