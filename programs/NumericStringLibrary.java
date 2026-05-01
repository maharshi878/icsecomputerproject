import java.util.*;
public class NumericStringLibrary {

    static int square(int n){
        return n*n;
    }

    static void checkChar(char c){
        System.out.println("Uppercase: "+Character.isUpperCase(c));
        System.out.println("Digit: "+Character.isDigit(c));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numeric string: ");
        String s=sc.nextLine();

        int num=Integer.parseInt(s);
        System.out.println("Square="+square(num));

        System.out.print("Enter char: ");
        char ch=sc.next().charAt(0);
        checkChar(ch);
    }
}