import java.util.*;
public class SentenceNumberSum {
    static int wordCount(String s){
        StringTokenizer st=new StringTokenizer(s);
        return st.countTokens();
    }

    static int sumNumbers(String s){
        int sum=0;
        String num="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c))
                num+=c;
            else{
                if(!num.equals("")){
                    sum+=Integer.parseInt(num);
                    num="";
                }
            }
        }
        if(!num.equals("")) sum+=Integer.parseInt(num);
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence:");
        String s=sc.nextLine();

        System.out.println("Words="+wordCount(s));
        System.out.println("Sum of numbers="+sumNumbers(s));
    }
}