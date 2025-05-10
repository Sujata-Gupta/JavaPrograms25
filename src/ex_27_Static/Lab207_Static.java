package ex_27_Static;

public class Lab207_Static {
    public static void main(String[] args) {
        P.display1();//staic method
        System.out.println(P.b); //static variable
        P p1=new P();
        System.out.println(p1.a);
        p1.display();


    }

}

class P
{
    int a=10;
    static int b=9;

    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
    static void display1()
    {
        System.out.println(b);
       // System.out.println(a);
    }

    static class C
    {
        //no use
    }



}
