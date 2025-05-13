package ex_30_Exceptions;

public class Lab225_IQ {
    public static void main(String[] args) {
        try
        {
            String input= args[0];
            int a= Integer.parseInt(input);
            int output=100/a;
        }
        catch (ArithmeticException | NullPointerException | NumberFormatException e)
        {
            // new NumberFormatException (); JVM is creating the object

            System.out.println(e.getMessage());
        }
    }
}
