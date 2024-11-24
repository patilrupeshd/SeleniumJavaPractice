package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ParenthesisCount {
    public static List<String> genrateParanthesis(int n)
    {
        List<String> result = new ArrayList<>();
        genrateParanthesisHelperMethod(  result, "", 0, 0, n);
        return result;
    }
    public static void genrateParanthesisHelperMethod(List<String> result, String current, int open, int close, int max)
    {
        if(current.length()==max*2)
        {
            result.add(current);
            return;
        }
        if(open<max)
        {
            genrateParanthesisHelperMethod(result,current+'(',open+1,close,max);
        }
        if(close<open)
        {
            genrateParanthesisHelperMethod(result,current+')',open,close+1,max);
        }
    }

    public static void main(String[] args) {
        System.out.println(genrateParanthesis(3));
    }
}
