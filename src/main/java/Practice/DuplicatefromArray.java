package Practice;

public class DuplicatefromArray {

    public static void main(String[] args) {
       int dup[] = {2,1,3,2,4,3,5,4,4};
       for (int i = 0; i<dup.length;i++)
       {
            for(int j = i + 1; j<dup.length;j++)
            {
                if(dup[i] == dup[j])
                {
                    System.out.println(dup[j]);
                    break;
                }
            }
       }
    }
}
