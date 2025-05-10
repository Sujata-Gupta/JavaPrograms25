package ex_23_OOPs_Super;

public class ex_23_OOPs_Super {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
        d.sound();
        Animal A=new Animal();
        System.out.println(A.color);
        A.sound();
    }

}
class God
{
    void sound()
    {
        System.out.println("God sound");

    }
}
class Animal extends God
{
    String color="pink";
    void sound()
    {
        System.out.println("Animal sound");
        super.sound();
    }
}
class Dog extends Animal{
    String color="Black";

    void display()
    {
        System.out.println(this.color);
        System.out.println(super.color);
    }

    void sound()
    {
        System.out.println("Dog Sound");
    }
    Dog()
    {
        super.sound();
    }

}
