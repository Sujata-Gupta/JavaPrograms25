package ex_11_While;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        sc.close();
        int fact=1;
//        while (a>=1)
//        {
//            fact=fact*a;
//
//            a--;
//        }
   //     System.out.println("Factorial of number is " + fact);

        for (int i=1;i<=a;i++)
        {
            fact=fact*a;

            a--;
        }
        System.out.println("Factorial of number is " + fact);

    }
}
