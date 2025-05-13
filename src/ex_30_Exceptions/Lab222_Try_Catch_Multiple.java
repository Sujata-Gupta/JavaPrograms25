package ex_30_Exceptions;

public class Lab222_Try_Catch_Multiple {
    public static void main(String[] args) {
        try
        {
            int a=10/0;

        }
        catch (RuntimeException e)
        {
            System.out.println("you fool");
        }
        catch (Exception e)
        {
            System.out.println("fool");
        }
    }
}
