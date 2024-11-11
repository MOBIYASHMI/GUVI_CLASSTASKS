package GUVI_CLASSTASKS.Task4.Question4;
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
        System.out.println("Grade of "+name+" = " +hashMap.get(name));
    }

    public static void main(String[] args) {
        Students students=new Students();
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("John",97);
        hashMap.put("Peter",98);
        hashMap.put("Zack",100);
        Scanner obj=new Scanner(System.in);

        // add student and grade
        System.out.println("Enter name of the student and grade to be added: ");
        String name=obj.next();
        int grade= obj.nextInt();
        students.addStudent(hashMap,name,grade);
        System.out.println(hashMap);

        // remove student
        System.out.println("Enter name of the student to be removed : ");
        name=obj.next();
        students.removeStudent(hashMap,name);

        // display grade
        System.out.println("Enter name of the student to see grade : ");
        name=obj.next();
        students.displayGrade(hashMap,name);
    }
}