package ex_10_forLoop;

public class lab113_forloop_continue_EvenNumbers {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println("odd " + i);


        }

    }
}
