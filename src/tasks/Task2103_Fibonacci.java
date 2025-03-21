package tasks;

import java.util.Scanner;

public class Task2103_Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        sc.close();
        int a=0;
        int b=1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        int next=a+b;

        System.out.print(next+" ");

        for(int i=2;i<=n;i++)
        {
            a=b;
            b=next;
            next=a+b;
            System.out.print(next+" ");

        }

    }
}
