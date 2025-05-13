package ex_30_Exceptions;

public class Lab229_Jr_QA_VS_Sr_QA {
    public static void main(String[] args) {
        String ip=null;
        try
        {
            ip=args[0];

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
