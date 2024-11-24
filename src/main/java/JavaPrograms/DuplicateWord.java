package JavaPrograms;

import java.util.Objects;

public class DuplicateWord {
    public static void main(String[] args) {

        String duplicateString = "Big black bug bit a big black dogs on his big black nose";
        duplicateString = duplicateString.toLowerCase();

        String[] words = duplicateString.split("\\s");

        int count;
        for (int i = 0; i <words.length;i++)
        {
            count=1;
             for (int j = i+1;j< words.length;j++)
             {
                 if(Objects.equals(words[i], words[j]))
                 {
                     count++;
                  //Set words[j] to 0 to avoid printing visited words
                     words[j]="0";
                 }
             }
             //Display the words if count it grether than 1
            if(count>1 && words[i]!="0")
            {
                System.out.println(words[i]);
            }
        }

    }

}
