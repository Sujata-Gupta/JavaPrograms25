package ex_26_IIB;

public class Lab203_IIB {
    public static void main(String[] args) {
        a a1=new a();
        new a();

    }
}
class a
{
    a(){
        System.out.println("DC");
    }
    {
        System.out.println("this is IIB");
    }
    {
        System.out.println("This is IIB 2");
    }
}
