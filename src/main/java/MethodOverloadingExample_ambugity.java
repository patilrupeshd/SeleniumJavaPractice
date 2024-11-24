public class MethodOverloadingExample_ambugity {
    public void printMessage(int i)
    {
        System.out.println(i);
    }
    public void printMessage(double s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {
        MethodOverloadingExample_ambugity m = new MethodOverloadingExample_ambugity();
        double num = 10.0f;
        m.printMessage(10);

    }
}
