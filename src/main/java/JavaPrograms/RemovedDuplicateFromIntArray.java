package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovedDuplicateFromIntArray {
    public static void main(String[] args) {
//        int inArry[] = {1,2,33,44,33,45,3,2,44,55,44};
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i<inArry.length;i++)
//        {
//            set.add(inArry[i]);
//        }
//        System.out.println(set);
        String string = "WellcomeAutomation";
        char[] chars = string.toCharArray();
        String newSting = new String();
        for(int i=0;i<chars.length;i++)
        {
            char cout = 8;
            if(i==cout)
            {
                newSting = newSting+"to"+chars[i];
            }
            else
            {
                newSting = newSting+chars[i];
            }



        }
        System.out.println(newSting);
    }



}
