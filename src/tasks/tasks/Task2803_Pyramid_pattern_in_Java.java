package tasks.tasks;

import java.util.Scanner;

public class Task2803_Pyramid_pattern_in_Java {
    public static void main(String[] args) {
     //      *
      //    ***
      //   *****
      //  *******
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
       int n=sc.nextInt();

        for (int i = 1; i <n ; i++)
        {
            for (int j=n;j>i;j--) {
                System.out.print(" ");

            }

            for (int k=0;k<i*2-1;k++)//1,3,5
            {
                System.out.print("*");
            }
            System.out.println();


            }

        }
    }

