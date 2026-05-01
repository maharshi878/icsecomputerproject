import java.util.*;
public class ReplaceVowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String result=s.replaceAll("(?i)[aeiou]","*");
        System.out.println(result);
    }
}