package tasks.task0404_OoPS.Encapsulation_;

public class Inheritance {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.BankName();
        SBI b1=new SBI();
        b1.BankName1();
        Bank b2=new SBI();
        b2.BankName();



    }

}
//single inheritance
class Bank
{
    void BankName() {
        System.out.println("This is Bank head branch");
    }
}
class SBI extends Bank
{
    void BankName1()
    {
        System.out.println("This is SBI");
    }
}
//multilevel
class SBINoida extends SBI
{
    void BankName2()
    {
        System.out.println("This is SBI noida");
    }
}
//Hierarical
class BOB extends Bank
{
    void BankName3()
    {
        System.out.println("This is BOB");
    }
}


