package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
void add(int a,int b)
{
    System.out.println(a+b);
}
 void add(int a,int b,int c)
{
    System.out.println(a+b+c);
}

    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.add(2,3);
        c1.add(2,5,7);
    }


}
