package Practice;

import java.util.*;

public class FindDuplicatesInTheList {

    public static void main(String[] args) {
        List<Integer> duplicate = Arrays.asList(1,2,3,2,3,43,4,53,4,5,5,6,6,7,7,8,8,9);
        System.out.println(findDuplicateInTheList(duplicate));

    }
    public static List<Integer> findDuplicateInTheList(List<Integer> list)
    {
        List<Integer> duplicate = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int in :  list){
            if(!set.add(in))
            {
                duplicate.add(in);
            }
        }

        return duplicate;
    }
}
