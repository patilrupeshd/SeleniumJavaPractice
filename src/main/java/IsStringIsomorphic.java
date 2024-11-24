import java.util.HashMap;
import java.util.Map;

public class IsStringIsomorphic {

    public static void main(String[] args) {
        System.out.println("Given Strings are isomorphic " + areIsomorphic("Rupesh","Rupesh"));
    }
    public static boolean areIsomorphic(String str1, String str2)
    {
            if(str1.length()!=str2.length())
            {
                return false;
            }
            Map<Character,Character> map = new HashMap<>();
            Map<Character,Boolean> mapped = new HashMap<>();
            for(int i =0 ; i < str1.length();i++)
            {
                char charStr1 = str1.charAt(i);
                char charStr2 = str2.charAt(i);
                if(map.containsKey(charStr1))
                {
                    if(map.get(charStr1) != charStr2)
                    {
                        return false;
                    }
                }
                else {
                    if(mapped.containsKey(charStr2))
                    {
                        return false;
                    }
                    map.put(charStr1,charStr2);
                    mapped.put(charStr2,true);

                }
            }
        System.out.println(mapped + " " + map);

            return true;
    }
}
