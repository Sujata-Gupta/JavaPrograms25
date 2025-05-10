package ex_25_OOPs_Abstraction_Interface;

public class Lab200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Son s1=new Son();

        s1.money();
    }

}

class Son implements father,mother
{

    @Override
    public void money() {
        System.out.println("paid");
    }
}




interface father

{
    void money();
}

interface mother{
    void money();
}