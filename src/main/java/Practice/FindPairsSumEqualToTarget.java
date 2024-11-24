package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairsSumEqualToTarget {
    public static void main(String[] args) {
        int []a = {1,2,4,3,5,6,7};
        int target = 5;
        List<int[]> pairs = findPairs(a,target);
        for (int []pair : pairs)
        {
            System.out.println(pair[0] + " AND " + pair[1]);
        }
    }
        
        
    private static List<int[]> findPairs(int[] a, int target) {
        Set<Integer> seen = new HashSet<>(); 
        List<int[]> pairs = new ArrayList<>();
        
        for (int num : a)
        {
            int complement = target - num;
            if(seen.contains(complement))
            {
                pairs.add(new int[] {num,complement});
            }
            seen.add(num);
        }
        return pairs;
    }    
}
