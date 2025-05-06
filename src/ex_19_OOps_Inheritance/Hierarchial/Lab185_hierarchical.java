package ex_19_OOps_Inheritance.Hierarchial;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Mother m1 = new Mother();
        m1.home();

        daughter d1 = new daughter();
        d1.home();
        Mother p1=new daughter();
p1.home();

    }
}


    class Mother {
        String address;
        void home() {
            System.out.println("12");
        }

    }

    class daughter extends Mother {
        String name;

        void eat() {
            System.out.println("daughter eating");
        }
    }

        class son extends Mother

        {
            String name;
            void run()
            {
                System.out.println("son running");
            }
        }




