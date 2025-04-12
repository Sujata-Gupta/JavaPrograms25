package tasks;

import static java.lang.Math.*;

public class Task1203_math {
    public static void main(String[] args) {
       double x=10;
        double y=10;
        double z=10;

        double result=Math.cbrt(Math.pow(x,2)+(Math.pow(y,2)-Math.abs(z)));

        /*x= Math.pow(x,2);
        y= Math.pow(y,2);
        z= abs(z);
        double a=y-z;
        double b= x+a;
        double result= cbrt(b);*/
        System.out.println(result);

    }
}
