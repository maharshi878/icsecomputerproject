public class BankAccountConstructor {
    int accNo;
    String name;
    double balance;

    BankAccountConstructor(){
        balance=0;
    }

    BankAccountConstructor(int a,String n,double b){
        accNo=a;
        name=n;
        balance=b;
    }

    BankAccountConstructor(int a,String n,double b,double rate){
        accNo=a;
        name=n;
        balance=b;
        double interest=balance*rate/100;
        balance+=interest;
    }

    void display(){
        System.out.println(accNo+" "+name+" "+balance);
    }

    public static void main(String[] args){
        BankAccountConstructor a=new BankAccountConstructor();
        BankAccountConstructor b=new BankAccountConstructor(101,"Amit",5000);
        BankAccountConstructor c=new BankAccountConstructor(102,"Riya",5000,5);

        a.display();
        b.display();
        c.display();
    }
}