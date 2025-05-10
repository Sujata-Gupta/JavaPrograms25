package ex_22_OOPs_accessModifer.police;

public class Cop {
    private int gun;
    String iCard;

    Cop(int bullet)
    {
       this.gun=bullet;
    }

    protected void CanIshoot()
    {
        System.out.println("Yes");
    }

}
