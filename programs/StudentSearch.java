import java.util.*;
public class StudentSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s[]=new String[10];

        for(int i=0;i<10;i++)
            s[i]=sc.nextLine();

        System.out.print("Search name:");
        String name=sc.nextLine();

        boolean found=false;

        for(int i=0;i<10;i++){
            if(s[i].equalsIgnoreCase(name)){
                System.out.println("Found at "+(i+1));
                found=true;
            }
        }

        if(!found) System.out.println("Not found");

        System.out.println("Names starting with SRI:");
        for(String x:s)
            if(x.startsWith("SRI"))
                System.out.println(x);
    }
}