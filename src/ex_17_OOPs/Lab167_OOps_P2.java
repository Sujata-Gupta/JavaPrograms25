package ex_17_OOPs;

public class Lab167_OOps_P2 {
    public static void main(String[] args) {
        student s1=new student();
        s1.play();
        s1.age=12;
        s1.name="asas";
        s1.details();

    }
}

class student
{
    String name;
    byte age;
    String address;
    int Phone;

    void play()
    {
        System.out.println("playing");
    }

    void study()
    {
        System.out.println("studying");
    }


    void details()
    {
        System.out.println(name+age);
    }
}
