package Practice;

public class ReverseString {
    public static String getReverseString(String strToBeReverse)
    {
        char[] charArray = strToBeReverse.toCharArray();
        String reverse ="";
        for(int i = charArray.length-1;i>=0;i--)
        {
            reverse +=charArray[i];
        }
        return reverse;
    }
    public static String getReverseWords(String strToBeReverse)
    {
        String[] tempWord = strToBeReverse.split("\\s");
        String revesedWord = "";
        for (int i = 0;i<=tempWord.length-1;i++)
        {
            revesedWord += getReverseString(tempWord[i]) + " ";
        }
        return revesedWord;
    }

    public static void main(String[] args) {
        System.out.println(getReverseWords("Rupesh Patil"));
    }
}
