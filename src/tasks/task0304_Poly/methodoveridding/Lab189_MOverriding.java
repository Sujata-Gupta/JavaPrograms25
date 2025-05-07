package tasks.task0304_Poly.methodoveridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        Animal an=new Animal();
        an.speak();
        Animal dg=new dog();
        dg.speak();
        dog d=new dog();
        d.speak();
    }
}
class Animal
{
    void speak()
    {
        System.out.println("null");
    }
}

class dog extends Animal
{
    void speak()
    {
        System.out.println("Bark");
    }
}
