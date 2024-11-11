package GUVI_CLASSTASKS.Task4.Question1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}

class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}

public class Student{
    int rollNo;
    String name;
    int age;
    String course;

    // initialized values through constructor
    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // If age is not between 15 and 21, then raise user defined exception "AgeNotWithinRangeException"
    public void checkAge() throws AgeNotWithinRangeException{
        if(age<15 || age>21){
            throw new AgeNotWithinRangeException("Age is not in the range");
        }else{
            System.out.println("Valid age");
        }
    }

    // If name contains numbers or special symbols raise "NameNotValidException" exception
    public void nameCheck() throws NameNotValidException{
        Pattern p = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(name);
        boolean res=m.find();
        if(res){
            throw new NameNotValidException("Name contains special symbols or numbers");
        }else{
            System.out.println("Valid name");
        }
    }

    public static void main(String[] args) {

        int age=12;
        String name="Mobi@";
        // initialized values through constructor
        Student student=new Student(3,name,age,"java");
        try {
            student.checkAge();
        }catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            student.nameCheck();
        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}