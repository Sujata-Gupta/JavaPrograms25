package tasks;

import java.util.Scanner;

public class Task2103_Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int a=0;
        System.out.print(a+" ");
        int sum;
        for(int i=1;i<=n;i++)
        {
            sum=(i-1)+i;
            System.out.print(sum+" ");

        }

    }
}
