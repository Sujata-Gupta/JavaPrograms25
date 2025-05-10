package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
WagonR c=new WagonR();
c.driver();
    }

}


























abstract class Engine
{
    abstract void StartEngine();
    abstract void StopEngine();
}

class WagonR extends Engine
{

    @Override
    void StartEngine() {
        System.out.println("Starting");
    }

    @Override
    void StopEngine() {
        System.out.println("Stoping");
    }

    void driver()
    {
        StartEngine();
        StopEngine();
    }
}
