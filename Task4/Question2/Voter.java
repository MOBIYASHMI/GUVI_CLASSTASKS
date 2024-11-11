package GUVI_CLASSTASKS.Task4.Question2;

public class Voter {
    int voterId;
    String name;
    int age;

    // parameterized constructor should throw checked exception if age is less than 18
    public Voter(int voterId, String name, int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Invalid age for voter");
        }else{
            System.out.println("Valid age for voting");
        }
    }

    public static void main(String[] args) {
        try{
            Voter voter=new Voter(30,"mobi",12);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Checked and evaluated the voter age");
        }

    }
}
