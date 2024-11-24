package JavaPrograms;

public class SwpStringWithOutThrredVar {

    public static void main(String[] args) {
        String str1 = "rupesh";
        String str2 = "Patil";


        System.out.println(str1 + "    " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length())

                ;

        System.out.println(str1 + "    " + str2);
    }
}
