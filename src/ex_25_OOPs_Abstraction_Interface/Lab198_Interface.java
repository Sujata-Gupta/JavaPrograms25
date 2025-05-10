package ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        sqaure s=new sqaure();
        s.area(2,2);
        rectangle r=new rectangle();
        r.area(5,9);
    }
}


class sqaure implements polygon
{

    @Override
    public void area(int a, int b) {
        int areaS=a*b;
        System.out.println(areaS);
    }

}

class rectangle implements polygon
{

    @Override
    public void area(int a, int b) {
        int areaR=a*b;
        System.out.println(areaR);
    }
}






interface polygon
{
    void area(int a,int b);
}