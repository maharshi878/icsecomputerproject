import java.util.*;
public class SalaryCalculator {
    int yos,qual;
    char gen;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Gender (M/F): ");
        gen=sc.next().charAt(0);
        System.out.print("Years of service: ");
        yos=sc.nextInt();
        System.out.print("Qualification (1=Graduate,2=PostGraduate): ");
        qual=sc.nextInt();
    }

    void display(){
        int salary=0;

        if(gen=='M'){
            if(yos>=10 && qual==2) salary=15000;
            else if(yos>=10) salary=10000;
            else if(qual==2) salary=10000;
            else salary=7000;
        }
        else{
            if(yos>=10 && qual==2) salary=12000;
            else if(yos>=10) salary=9000;
            else if(qual==2) salary=10000;
            else salary=6000;
        }

        System.out.println("Salary = "+salary);
    }

    public static void main(String args[]){
        SalaryCalculator obj=new SalaryCalculator();
        obj.input();
        obj.display();
    }
}