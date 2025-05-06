package ex_17_OOPs;

public class Lab166_OOPs {

    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 23;
        p1.city = "Noida";
        p1.name = "Shikhar";
        p1.sleep();


    }
}
    class person{

        String name;
        String city;
        byte age;

        void sleep()
        {
            System.out.println("sleeping");
        }

        void job()
        {

        }
    }

