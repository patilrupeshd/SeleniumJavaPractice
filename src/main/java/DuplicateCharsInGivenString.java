import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInGivenString
{
    public static Map<Character,Integer> findDuplicateCharsFromString(String str)
    {
        Map<Character,Integer> map = new HashMap<>();
        String duplicate = "";

        for (char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //for (Map.Entry<Character,Integer> m : map.entrySet())
        //{
           // if(m.getValue()>1)
            //{
             //   duplicate +=m.getKey();
            //}
          //  duplicate = m.getKey() + "_" + m.getValue();

//        }

        return map;
    }
    public static void main(String[] args) {
        String str = "Find Dupliucate";
        Map<Character,Integer> map = findDuplicateCharsFromString(str);
        for(Map.Entry<Character,Integer> m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // System.out.println(duplicatesChar);
    }
}
