package Practice;

import java.util.Scanner;

public class PrimeNUmber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start Number : ");
        int start = sc.nextInt();
        System.out.println("Enter End Number : ");
        int end = sc.nextInt();

        for (int i = start;i<=end;i++)
        {
            if (isPrime(i))
            {
                System.out.println(i + " is Prime");
            }
        }
    }

    public static boolean isPrime(int number)
    {
        if(number<=1)
            return false;
        for(int i = 2; i <= Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
