package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        A a2=new A();


    }
}
class A
{
    {
        System.out.println("IIb");
    }
    static {
        System.out.println("SIB");

    }
    A()
    {
        System.out.println("DC");
    }
}
