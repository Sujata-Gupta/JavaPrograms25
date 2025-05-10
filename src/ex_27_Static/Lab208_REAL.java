package ex_27_Static;

public class Lab208_REAL {
    public static void main(String[] args) {
ATB.classjoin();
ATB.DoAssign();
ATB a=new ATB();
a.setName("amit");
a.setPhone(5465325);
        System.out.println(ATB.mentorname);



    }
}

class ATB
{
    private String name;
    private long phone;

    static String mentorname="pramod";
    static String coursename="ATB11x";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    static void classjoin()
    {
        System.out.println("joined class");
    }

    static void DoAssign()
    {
        System.out.println("assignment do!");
    }

    static {
        System.out.println("SIB register to class");
    }

    {

        System.out.println("IIB");
    }


}
