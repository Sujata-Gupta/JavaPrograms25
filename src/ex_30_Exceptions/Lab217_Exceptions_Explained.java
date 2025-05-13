package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {
    public static void main(String[] args) {

        System.out.println("Enter number");
        String num=args[0];//ArrayIndexOutOfBoundsException
        Integer a=Integer.parseInt(num);
       Integer num1=100/a; //in case a=0 ArithmeticException //NumberFormatException




    }
}
