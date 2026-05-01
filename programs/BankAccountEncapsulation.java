import java.util.*;
public class BankAccountEncapsulation {
    private String accountHolder;
    private double balance;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Account holder:");
        accountHolder=sc.nextLine();
        System.out.print("Balance(string):");
        String b=sc.nextLine();
        balance=Double.parseDouble(b);
    }

    void deposit(double amt){
        balance+=amt;
    }

    void withdraw(double amt){
        if(balance>=amt) balance-=amt;
        else System.out.println("Insufficient balance");
    }

    void display(){
        System.out.println(accountHolder+" "+balance);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccountEncapsulation a=new BankAccountEncapsulation();
        a.input();

        System.out.print("Deposit:");
        a.deposit(sc.nextDouble());

        System.out.print("Withdraw:");
        a.withdraw(sc.nextDouble());

        a.display();
    }
}