package ex_30_Exceptions;

import java.util.Scanner;

public class Lab234_Throw {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try
        {
            validateage(a);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }





    }

    static void validateage(int age) throws  ArithmeticException,NullPointerException,Exception
    {
        if(age<18)
        {
            throw  new Exception("Below 18, Can't go!");

        }
    }

}
