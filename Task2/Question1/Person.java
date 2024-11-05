package GUVI_CLASSTASKS.Task2.Question1;

public class Person {
    String name;
    int age =18; // a. default age of person should be 18

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){  // c. method to display name and age of person
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
    }

    public static void main(String[] args) {
        Person person=new Person("MOBIYASHMI",24); // b. person object initialized with name and age
        person.display();
    }
}
