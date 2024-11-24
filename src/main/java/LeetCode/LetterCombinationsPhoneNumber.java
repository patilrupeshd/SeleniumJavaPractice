package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {

    public List<String> letterCombination(String digits)
    {
        List<String> combinations = new ArrayList<>();
        if(digits==null || digits.isEmpty())
        {
            return combinations;
        }
        Map<Character,String> keyPad = new HashMap<>();
        keyPad.put('2',"abc");
        keyPad.put('3',"def");
        keyPad.put('4',"ghi");
        keyPad.put('5',"jkl");
        keyPad.put('6',"mno");
        keyPad.put('7',"pqrs");
        keyPad.put('8',"tuv");
        keyPad.put('9',"wxyz");

        combinations.add("");

        for (char digit : digits.toCharArray())
        {
            String letters = keyPad.get(digit);
            List<String> temp = new ArrayList<>();
            for (String res : combinations)
            {
                if(letters==null)
                {
                    continue;
                }
                for (char letter : letters.toCharArray())
                {
                    temp.add(res+letter);
                }
            }
            combinations = temp;
        }
        return combinations;
    }



    public static void main(String[] args) {

        LetterCombinationsPhoneNumber lc = new LetterCombinationsPhoneNumber();
        System.out.println(lc.letterCombination("23"));
        System.out.println(lc.letterCombination("0"));
        System.out.println(lc.letterCombination("3"));

    }
}
