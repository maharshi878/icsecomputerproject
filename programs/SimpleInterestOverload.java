import java.util.*;
public class SimpleInterestOverload {

    double interest(int p,int t,int r){
        return (p*t*r)/100.0;
    }

    double interest(double p,double t,double r){
        return (p*t*r)/100.0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SimpleInterestOverload obj=new SimpleInterestOverload();

        System.out.print("Principal:");
        double p=sc.nextDouble();
        System.out.print("Time:");
        double t=sc.nextDouble();
        System.out.print("Rate:");
        double r=sc.nextDouble();

        System.out.println("Simple Interest="+obj.interest(p,t,r));
    }
}