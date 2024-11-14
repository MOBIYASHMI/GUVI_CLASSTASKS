package GUVI_CLASSTASKS.Task5;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {

        // List interface to store students
        List<String> students= Arrays.asList("John","Ashok","Peter","Ashin","Sahana","Anjali","Dhruv","Jai","Ahana","Reva");

        // lambda expression and Stream API to filter students whose names starts with "A"

        List<String> giftToStudents=students.stream().filter(student -> student.charAt(0)=='A').toList();

        System.out.println("Students list whose name start with 'A' : ");

        giftToStudents.forEach(System.out::println);
    }
}
