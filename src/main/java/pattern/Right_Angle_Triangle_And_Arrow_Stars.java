package pattern;

public class Right_Angle_Triangle_And_Arrow_Stars {

    // *
    // **
    // ***   
    // ****  
    // ***** 
    // ******
    // ******
    // ***** 
    // ****  
    // ***   
    // **    
    // * 

    public static void main(String[] args) {
            for (int i = 0; i <= 5;i++)
            {               
                for(int k = 0; k<=i;k++)
                {
                    System.out.print("*");
                  
                }    
                System.out.println();
            }

            for (int i = 5; i >= 0;i--)
            {
                for(int j = i; j>=0;j--)
                {
                    System.out.print("*");
                  
                }
                System.out.println();
            }

            // int n = 5;
            // // Loop for both ascending and descending parts
            // for (int i = 0; i <= 2 * n; i++) {
            //     int limit = i <= n ? i : 2 * n - i;
            //     for (int j = 0; j <= limit; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            
    }



   
}
