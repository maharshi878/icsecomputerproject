public class PatternProgram2 {
    public static void main(String[] args) {
        int size = 5;

        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                if(i==1 || i==size || j==1 || j==size)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}