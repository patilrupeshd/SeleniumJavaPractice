package Practice;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] numbers = {1,2,4,5};
        System.out.println(findMissingNumber(numbers));
    }
    public static int findMissingNumber(int []numbers)
    {
        int n = numbers.length + 1; //Total count including missing number
        int sum = (n * (n + 1)) / 2; //sum of all numbers from 1 to n;
        int actualSum = 0;
        for (int num : numbers)
        {
            actualSum +=num;

        }
        return sum - actualSum;

    }
}
