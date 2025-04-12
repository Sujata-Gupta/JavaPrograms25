package tasks;

import static java.lang.Math.*;

public class Task1203_math {
    public static void main(String[] args) {
       double x=10;
        double y=10;
        double z=10;

        x= Math.pow(x,2);
        y= Math.pow(y,2);
        z= abs(z);
        double a=y-z;
        double b= x+a;
        b= cbrt(b);
        System.out.println(b);

    }
}
