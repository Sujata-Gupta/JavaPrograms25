package tasks;

public class task3103_OOPs {
    public static void main(String[] args) {

        Person P1=new Person();
        P1.Name();
        int x=P1.getPhone();
        System.out.println(x);
        int y=P1.Contactupdate(64646546);
        System.out.println(y);
        P1.personMarried(true);
    }
}

    class Person
    {
        String Name;
        String lastName;
        int age;
        String city;
        int Salary;
        boolean isMarried;
        String companyName;
        String Country;
        boolean hasCar;
        int phone;

        void Name()
        {
            System.out.println(Name);
        }
        int getPhone()
        {
            return phone;

        }
        void personMarried(boolean a)
        {

            System.out.println("is married " + a);
        }

        int Contactupdate(int phone)
        {
            return phone;
        }

    }

