package ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {
        int a=10;
        Integer b=20;
        String num="30";

        //String to Wrapper
        Integer c=Integer.parseInt(num);
        Integer d=Integer.valueOf(num);

        // String to primitive
        int e=Integer.parseInt(num);

        // Wrapper to String
        System.out.println(b.toString());

        // primitive to String
        int x=10;
        Integer y=x;
        System.out.println(y.toString());


    }
}
