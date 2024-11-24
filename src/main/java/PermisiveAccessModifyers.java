public class PermisiveAccessModifyers {
    protected void setupWebDriver()
    {
        System.out.println("supercalss");
    }

    public static void main(String[] args) {
        PermisiveAccessModifyers p = new PermisiveAccessModifyers();
        p.setupWebDriver();

    }
}
class FirefoxDriver extends PermisiveAccessModifyers
{
    public void setupWebDriver()
    {
        System.out.println("subclass");
    }
}
