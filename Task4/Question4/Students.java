package GUVI_CLASSTASKS.Task4.Question4;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Students {
    // method to add a student
    void addStudent(HashMap hashMap,String name,int grade){
        hashMap.put(name,grade);
    }

    // method to remove a student
    void removeStudent(HashMap hashMap,String name){
        hashMap.remove(name);
    }

    // method to display grade of the student
    void displayGrade(HashMap hashMap,String name){
        System.out.println(hashMap.get(name));
    }

    public static void main(String[] args) {
        Students students=new Students();

        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("John",97);
        hashMap.put("Peter",98);
        hashMap.put("Zack",100);

        Scanner obj=new Scanner(System.in);

        System.out.println("Enter 1 if you want to add a student");
        System.out.println("Enter 2 if you want to remove a student");
        System.out.println("Enter 3 if you want the grade of the student");

        int option= obj.nextInt();
        if(option==1){
            System.out.println("Enter name of the student and grade to be added: ");
            String name=obj.next();
            int grade= obj.nextInt();
            students.addStudent(hashMap,name,grade);
        }else if(option==2){
            System.out.println("Enter name of the student to be removed : ");
            String name=obj.next();
            students.removeStudent(hashMap,name);
        }else if(option==3){
            System.out.println("Enter name of the student to see grade : ");
            String name=obj.next();
            students.displayGrade(hashMap,name);
        }else{
            System.out.println("Invalid option");
        }
    }
}
