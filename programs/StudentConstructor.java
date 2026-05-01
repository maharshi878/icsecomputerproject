import java.util.*;
public class StudentConstructor {
    String name;
    int marks;

    StudentConstructor(String n,int m){
        name=n;
        marks=m;
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String n=sc.nextLine();
        System.out.print("Enter marks:");
        int m=sc.nextInt();

        StudentConstructor s=new StudentConstructor(n,m);
        s.display();
    }
}