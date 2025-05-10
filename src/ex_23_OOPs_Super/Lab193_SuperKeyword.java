package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        TATA t = new TATA(12);
        t.getMaxSpeed();
        t.display();



    }
}

    class Vehicle

    {
        String name="Tata";
        public int maxSpeed=223;
        Vehicle()
        {
            System.out.println("default");
        }
        Vehicle(int a)
        {
            System.out.println("param cons");
        }

        void msg()
        {
            System.out.println("no return,no arg");
        }
        void msg(String a)
        {
            System.out.println(a);
        }
        void display()
        {
            System.out.println("parent Vehicle");
        }

    }

    class TATA extends Vehicle
    {
        private int maxSpeed=121;

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        TATA()
        {
            super();
        }
        TATA(int a)
        {
            super(10);
        }

        void display()
        {
            System.out.println(this.maxSpeed);
            System.out.println(super.maxSpeed);
            super.msg();
            super.msg("we");
            super.display();
        }



    }

