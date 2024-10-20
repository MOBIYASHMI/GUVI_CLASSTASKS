package GUVI_CLASSTASKS.Task1;

public class Question3 {
    public static void main(String[] args) {
        int num=876;
        int result=0;
        while (num > 0) {
            int digit=num%10;
            result=(result*10)+digit;
            num=num/10;
        }
        System.out.println("Reversed number = "+result);
    }
}
