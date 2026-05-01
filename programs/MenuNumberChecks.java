import java.util.*;
public class MenuNumberChecks {
    static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }

    static boolean isKrishnamurthy(int n){
        int temp=n,sum=0;
        while(temp>0){
            int d=temp%10;
            sum+=factorial(d);
            temp/=10;
        }
        return sum==n;
    }

    static boolean isBuzz(int n){
        return (n%7==0 || n%10==7);
    }

    static boolean isPalindrome(int n){
        int temp=n,rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev==n;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n1.Krishnamurthy Number");
            System.out.println("2.Buzz Number");
            System.out.println("3.Palindrome Number");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();

            if(choice==4) break;

            System.out.print("Enter number: ");
            int n=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println(isKrishnamurthy(n)?"Krishnamurthy Number":"Not Krishnamurthy");
                    break;
                case 2:
                    System.out.println(isBuzz(n)?"Buzz Number":"Not Buzz Number");
                    break;
                case 3:
                    System.out.println(isPalindrome(n)?"Palindrome":"Not Palindrome");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);
    }
}