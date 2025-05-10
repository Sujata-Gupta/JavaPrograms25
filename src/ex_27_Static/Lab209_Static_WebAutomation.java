package ex_27_Static;

public class Lab209_Static_WebAutomation {
    public static void main(String[] args) {
        Automation a1=new Automation();
        System.out.println(Automation.driver);

        Automation a2=new Automation();
        System.out.println(Automation.driver);

    }



}

class Automation
{
    static String driver="Chrome";
}

