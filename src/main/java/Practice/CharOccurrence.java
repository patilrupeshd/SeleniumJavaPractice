package Practice;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
public static void main(String[] args) {
        Map<Character, Integer> m = charCount("Rupesh Patil");
        for(Map.Entry<Character,Integer> m1 : m.entrySet())
        {
            System.out.println(m1.getKey() + " = " + m1.getValue());
        }
}   

public static Map<Character, Integer> charCount(String str)
{
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.toCharArray().length;i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
}
}
