import java.util.*;
public class SeriesMenu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Print series 0,3,8,15...");
        System.out.println("2.Sum of series (1/2)+(3/4)...(19/20)");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
                System.out.print("Enter n: ");
                int n=sc.nextInt();
                for(int i=1;i<=n;i++){
                    int term=i*i-1;
                    System.out.print(term+" ");
                }
                break;

            case 2:
                double sum=0;
                for(int i=1;i<=19;i+=2){
                    sum+= (double)i/(i+1);
                }
                System.out.println("Sum = "+sum);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}