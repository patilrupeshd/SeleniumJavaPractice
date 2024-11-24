package Practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PrintTableForGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Table");
        int table = sc.nextInt();
        System.out.println("Table for " + table);
        for(int i = 1; i<=10;i++)
        {
            System.out.println(i + " - " + table*i);
        }
    }

}
