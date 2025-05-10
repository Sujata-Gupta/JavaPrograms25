package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab197_Abstraction_REAL {
    public static void main(String[] args) {

    }
}

abstract class Employee {
    private String name;
    private String city;

    Employee()
    {
        System.out.println("DC");
    }
    Employee(String name,String city)
    {
        this.name=name;
        this.city=city;
    }
void mail()
{
    System.out.println(name+" "+city);
}
abstract double pay();
}
class c1 extends Employee
{

    @Override
    double pay() {
        return 0;
    }
}
