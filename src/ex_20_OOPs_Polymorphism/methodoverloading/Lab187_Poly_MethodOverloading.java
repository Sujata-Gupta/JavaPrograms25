package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        Mathoperations p1 = new Mathoperations();
        int x=p1.add(2,3);
       double y= p1.add(2.3,3.4);
       int z= p1.add(4,2,5);
        System.out.println(x);



    }
}

    class Mathoperations
    {
        int add(int a,int b)
        {
            return(a+b);
        }
        double add(double a,double b)
        {
            return (a+b);
        }
        int add(int a,int b,int c)
        {
            return a+b+c;
        }



    }

