package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        person p1=new person();
        p1.name="rajat";
        p1.eat();
        p1.walk();

        person p2=new person("Sujata","Kanpur");
        p2.walk();
        p2.eat();
        person p3=new person("anshul",30,"Delhi");
        p3.walk();
        p3.eat();

    }
}

    class person
    {
        String name;
        int age;
        String city;

        person()
        {
            name="Null";
            age=22;
            city="kanpur";
        }


        person(String name_arg,String address_arg){
        this.name=name_arg;
        this.city=address_arg;


        }
        person(String name1,int age1,String city1)
        {
           this.name=name1;
           this.age=age1;
           this.city=city1;

        }

        void eat()
        {
            System.out.println("eat "+name);
        }
        void walk()
        {
            System.out.println(name+" "+age+" "+city);
        }

    }

