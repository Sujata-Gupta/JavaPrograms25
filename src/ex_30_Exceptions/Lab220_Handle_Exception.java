package ex_30_Exceptions;

public class Lab220_Handle_Exception {
    public static void main(String[] args) {
        int a=0;
        try {
            Integer aa=a;
            Integer num=110;
            num=num/aa;

        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
