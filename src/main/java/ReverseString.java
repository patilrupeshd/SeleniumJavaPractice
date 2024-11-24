public class ReverseString {

    public static String reverseString(String str)
    {
        char []charArray = str.toCharArray();
        int length = charArray.length;
        char[] reverseArray = new char[length];

        for (int i = 0; i<length;i++)
        {
            reverseArray[i] = charArray[length - i - 1];
        }
        return new String(reverseArray);
    }

    public static void main(String[] args) {
        String str = reverseString("rupesh Patil");
        System.out.println(str);
    }
}
