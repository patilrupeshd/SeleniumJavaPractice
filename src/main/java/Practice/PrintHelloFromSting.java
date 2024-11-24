package Practice;

public class PrintHelloFromSting {
    public static void main(String[] args) {
        String str = "AHCECLWLXO";
        String [] strs = str.split("");

        for (int i = 1; i < strs.length; i=i+2)
        {
            System.out.print(strs[i].toLowerCase());
        }
    }
}
