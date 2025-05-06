package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multil_LEVEL {
    public static void main(String[] args) {
        GrandFather gf=new GrandFather();
        gf.homegf();
        gf.diamond();
        gf.goldgf();
        System.out.println("......................................................................");

        Father f=new Father();
        f.homef();
        f.goldf();
        f.diamond();
        f.homegf();
        f.goldgf();
        System.out.println("......................................................................");



        Son s=new Son();
        s.homes();
        s.diamond();
        s.goldf();
        s.goldgf();
        s.homegf();
        s.homef();

    }

}
