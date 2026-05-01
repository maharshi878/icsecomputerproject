import java.util.*;
public class AnagramCheck {

    static boolean isAnagram(String a,String b){
        char[] x=a.toLowerCase().toCharArray();
        char[] y=b.toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x,y);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();

        if(isAnagram(a,b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}