package ex_30_Exceptions;

public class Lab223_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        try
        {
            int s=10/0;

        }
        catch (Exception e)
        {
            System.out.println("fool");
        }
//        catch (ArithmeticException e)        // Not possible as Big Exception is used before
//
//        {
//            System.out.println("fool");
//        }

    }
}
