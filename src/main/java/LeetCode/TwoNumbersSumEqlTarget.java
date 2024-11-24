package LeetCode;

public class TwoNumbersSumEqlTarget {

    public int[] findTwoNumbersWhichEqlToTheTargetFromArray(int []arr, int target)
    {
        int len = arr.length;
        int [] res = new int[2];
        for(int i = 0;i<len;i++)
        {
            for (int j = i;j<len;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    res[0] = arr[i];
                    res[1] = arr[i];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwoNumbersSumEqlTarget tn = new TwoNumbersSumEqlTarget();
        int []arr = {1,3,2,4,5,5};
        int []result = tn.findTwoNumbersWhichEqlToTheTargetFromArray(arr,10);
        for(int i = 0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
