import java.util.*;
public class AreaOverload {

    int area(int side){
        return side*side;
    }

    int area(int l,int b){
        return l*b;
    }

    double area(double r){
        return 3.14*r*r;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AreaOverload obj=new AreaOverload();

        System.out.println("1.Square 2.Rectangle 3.Circle");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
                System.out.print("Side: ");
                int s=sc.nextInt();
                System.out.println("Area="+obj.area(s));
                break;

            case 2:
                System.out.print("Length:");
                int l=sc.nextInt();
                System.out.print("Breadth:");
                int b=sc.nextInt();
                System.out.println("Area="+obj.area(l,b));
                break;

            case 3:
                System.out.print("Radius:");
                double r=sc.nextDouble();
                System.out.println("Area="+obj.area(r));
                break;
        }
    }
}