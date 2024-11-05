package GUVI_CLASSTASKS.Task2.Question3;
import java.util.Scanner;
public class Account {
    int balance;
    public Account(){
        System.out.println("Initialized no argument constructor");
        balance=60000;
        System.out.println("Balance = "+ balance);
    }
    public Account(String name, int accountnumber){
        System.out.println("Initialized two argument constructor");
        System.out.println("Hi, "+ name+ ".Your account number is "+ accountnumber);
        System.out.println("-----------------------");
    }
    // a. method to deposit the amount to the account
    void deposit(int amt){
        System.out.println("a. Amount deposited");
        this.balance=balance+amt;
    }
    // b. method to withdraw the amount from the account
    void withdraw(int amt){
        System.out.println("b. Amount withdrawn");
        this.balance=balance-amt;
    }
    // c. method to display the balance
    int balance(){
        return balance;
    }

    public static void main(String[] args) {
        Account account=new Account();
        Account account1=new Account("MOBIYASHMI",874528658);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        int amount=sc.nextInt();
        account.deposit(amount);
        System.out.println("-----------------------");
        System.out.println("Enter the amount to be withdrawn: ");
        amount=sc.nextInt();
        account.withdraw(amount);
        System.out.println("-----------------------");
        System.out.println("c. Account Balance = "+ account.balance());
    }
}
