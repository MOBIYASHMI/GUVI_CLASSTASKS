package GUVI_CLASSTASKS.Task5;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Get user's birthday as input and calculate their age
public class Question4 {
    public static void main(String[] args) throws ParseException {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthDate = obj.next();

        // Format the date
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(birthDate, formatter);
        System.out.println(startDate);

        // Getting current date with system default ZoneID
        LocalDate endDate=LocalDate.now(ZoneId.systemDefault());
        System.out.println(endDate);

        // Calculating age
        Period period=Period.between(startDate,endDate);
        System.out.println("Your age is : "+period.getYears()+" years, "+period.getMonths()+
                " months, and "+period.getDays()+" days.");

    }
}