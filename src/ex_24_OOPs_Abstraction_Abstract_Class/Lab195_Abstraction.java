package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
Son s =new Son();
s.Loan10k();
s.home();
    }
}

abstract class Father
{
    abstract void Loan10k();
    void home()
    {
        System.out.println("father Home");
    }
}
class Son extends Father
{

    @Override
    void Loan10k() {
        System.out.println("Loan paid");
    }
}

