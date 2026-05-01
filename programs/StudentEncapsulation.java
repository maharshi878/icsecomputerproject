import java.util.*;
public class StudentEncapsulation {
    private String name;
    private String marks;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Name:");
        name=sc.nextLine();
        System.out.print("Marks:");
        marks=sc.nextLine();
    }

    int getMarks(){
        return Integer.parseInt(marks);
    }

    void display(){
        int m=getMarks();
        char grade;

        if(m>=75) grade='A';
        else if(m>=50) grade='B';
        else grade='C';

        System.out.println(name+" "+m+" Grade:"+grade);
    }

    public static void main(String[] args){
        StudentEncapsulation s=new StudentEncapsulation();
        s.input();
        s.display();
    }
}