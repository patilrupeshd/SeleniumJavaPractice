package pattern;

public class Hollow_Pyramid {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                    System.out.print(" ");
            }
            if( i == 1 || i == n)
            {
                for (int j = 0; j < n; j++) {
                    //System.out.print("*");
                }
                System.out.print("*");
            }
            else
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
