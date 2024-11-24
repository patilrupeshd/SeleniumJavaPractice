import java.util.HashMap;
import java.util.Scanner;

public class PrintDuplicateElementInAarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        String ans = "";
        int i=0;
        HashMap<String,String> wordToDigitMap = new HashMap<>();
        wordToDigitMap.put("zero", "0");
        wordToDigitMap.put("one", "1");
        wordToDigitMap.put("two", "2");
        wordToDigitMap.put("three", "3");
        wordToDigitMap.put("four", "4");
        wordToDigitMap.put("five", "5");
        wordToDigitMap.put("six", "6");
        wordToDigitMap.put("seven", "7");
        wordToDigitMap.put("eight", "8");
        wordToDigitMap.put("nine", "9");
        while(i<arr.length){
            if(arr[i].equals("double")){
                ans= ans+wordToDigitMap.get(arr[i+1]) + wordToDigitMap.get(arr[i+1]);
                i++;
            }
            else if(arr[i].equals("triple")){
                ans= ans+wordToDigitMap.get(arr[i+1]) + wordToDigitMap.get(arr[i+1]) + wordToDigitMap.get(arr[i+1]);
                i++;
            }
            else {
                ans= ans+wordToDigitMap.get(arr[i]);
            }
            i++;
        }
        System.out.print(ans);

    }

}
