package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindTwoindexValuesfromArrayAsSameTarget {
    public static void main(String[] args) {

        int numArr[] = {2,7,11,15};
        int target = 18;
        int result[] = sumOfTwoIndexValusSameAsTarget(numArr,target);

        for(int i =0 ;i <result.length;i++)
        {
            System.out.print(result[i]);
            if(i<result.length-1)
            {
                  System.out.print(",  ");
            }
        }

    }
    public static int[] findTwoIndexWhichValuesSumEqualToTarget(int numArr[],int target)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i< numArr.length;i++)
        {
            int diff = target -numArr[i];

            if(map.containsKey(diff))
            {
                return new int[] {map.get(diff),i};
            }
            map.put(numArr[i],i);

        }

        return new int [0];
    }

    public static int[] sumOfTwoIndexValusSameAsTarget(int[] numArr, int target)
    {
        int len = numArr.length;
        int [] res = new int[2];
        for(int i = 0 ; i < len; i++)
        {
            for(int j = i + 1; j < len; j++)
            {
                if(numArr[i]+numArr[j]==target);
                {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }


}
