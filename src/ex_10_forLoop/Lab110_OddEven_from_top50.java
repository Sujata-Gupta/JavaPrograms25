package ex_10_forLoop;

public class Lab110_OddEven_from_top50 {
    public static void main(String[] args) {
        for (int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" is even");
            }
            else
                System.out.println(i+" is odd");
        }
    }
}
