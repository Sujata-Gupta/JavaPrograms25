package ex_30_Exceptions;

import java.security.spec.ECField;
import java.util.Scanner;

public class Lab228_TryCatch_Finally_Purpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try
        {
            int b=a/10;
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("test completed");
        }




    }
}
