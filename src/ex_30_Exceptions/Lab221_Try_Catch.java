package ex_30_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {
        try
        {
            Integer a=10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
