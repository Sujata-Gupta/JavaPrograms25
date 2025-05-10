package ex_27_Static;

public class Lab206_Static {
    public static void main(String[] args) {
        B ref=new B(12);
        System.out.println(ref.a);
        System.out.println(ref.b);
        System.out.println(B.b);

        B ref1=new B(55);
        System.out.println(ref1.a);
        B.b=45;
        System.out.println(B.b);

        B ref2=new B(56);
        System.out.println(ref2.a);
        System.out.println(B.b);

    }


}
class B
{
    int a=10;
    static int b=9;

    B(int a)
    {
        this.a=a;
    }


}
