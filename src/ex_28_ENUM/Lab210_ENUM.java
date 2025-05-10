package ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(day.Fri);
        System.out.println(URl.goodle);
        A a=new A();
        System.out.println(a.days[5]);

    }
}

class A{
    String days[]={"Sun","Mon","Tues","Wed"};
}
enum day
{
    Mon,Tue,Wed,thurs,Fri,Sat,Sun;
}

enum URl
{
    goodle,linkedin;
}