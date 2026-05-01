import java.util.*;
public class YoungestAge {
    int ram,shyam,ajay;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age of Ram: ");
        ram=sc.nextInt();
        System.out.print("Enter age of Shyam: ");
        shyam=sc.nextInt();
        System.out.print("Enter age of Ajay: ");
        ajay=sc.nextInt();
    }

    void display(){
        int min=Math.min(ram,Math.min(shyam,ajay));
        if(min==ram) System.out.println("Ram is youngest");
        else if(min==shyam) System.out.println("Shyam is youngest");
        else System.out.println("Ajay is youngest");
    }

    public static void main(String[] args){
        YoungestAge obj=new YoungestAge();
        obj.input();
        obj.display();
    }
}