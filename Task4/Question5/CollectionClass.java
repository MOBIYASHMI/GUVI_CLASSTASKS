package GUVI_CLASSTASKS.Task4.Question5;

import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;

public class CollectionClass {

    // a. to push elements into the stack
    void pushElements(Stack stack,int element){
        stack.push(element);
    }

    // b. popping elements from the stack
    void popElements(Stack stack,int pop){
        for(int i=0;i<pop;i++){
            stack.pop();
        }
    }

    public static void main(String[] args) {

        CollectionClass col=new CollectionClass();
        Stack<Integer> stack=new Stack<>();

        Scanner obj=new Scanner(System.in);

        // a. to push elements into the stack
        System.out.println("Enter the number of elements to be pushed : ");
        int n= obj.nextInt();
        System.out.println("Enter the "+n+" numbers :");
        for(int i=0;i<n;i++){
            int element= obj.nextInt();
            col.pushElements(stack,element);
        }

        // b. popping elements from the stack
        System.out.println("Enter the number of elements to pop :");
        int pop= obj.nextInt();
        col.popElements(stack,pop);

        // c. check if stack is empty
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack has elements");
        }
        System.out.println(stack);
    }
}
