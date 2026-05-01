import java.util.*;
public class ArrayStats {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        for(int i=0;i<10;i++)
            arr[i]=sc.nextInt();

        int max=arr[0],min=arr[0],sum=0;

        for(int x:arr){
            if(x>max) max=x;
            if(x<min) min=x;
            sum+=x;
        }

        System.out.println("Largest="+max);
        System.out.println("Smallest="+min);
        System.out.println("Sum="+sum);
    }
}