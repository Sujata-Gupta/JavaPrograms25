package ex_25_OOPs_Abstraction_Interface;

public class Lab199_I {
    public static void main(String[] args) {
        car1 c1=new car1();
        c1.drive();

    }

}





class car1 implements Engine,Brakes
{
    void drive()
    {
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("apply break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop");

    }
}




interface Brakes{
    void applyBreak();
}
interface Engine
{
    void startEngine();
    void stopEngine();

}
