package tasks;

public class task104_OOPs {
    public static void main(String[] args) {
        person1 p1=new person1("Sujata");
        p1.age=12;
        person1 p2=new person1("Ram",28,"Noida",54425555,true);
        p2.printDetails();


    }
}
    class person1
    {
        String name;
        int age;
        String address;
        long phone;
        boolean isMale;
        person1()
        {
            System.out.println("This is default constructor");
        }
        person1(String name1)
        {
            this.name=name1;

            System.out.println(name1);
        }
        person1(String name,int age,String address,long phone,boolean isMale)
        {
            this.name=name;
            this.age=age;
            this.address=address;
            this.phone=phone;
            this.isMale=isMale;

        }
        person1(boolean isPMale)
        {
            this.isMale=isPMale;
        }


        void eat()
        {
            System.out.println("eating");
        }
        void sleep()
        {
            System.out.println("sleeping");
        }
        void walk()
        {
            System.out.println("walking");
        }
        void doHome()
        {
            System.out.println("in Home");
        }
        void printDetails()
        {
            System.out.println(name+" "+address+" "+age+" "+isMale);
        }


    }

