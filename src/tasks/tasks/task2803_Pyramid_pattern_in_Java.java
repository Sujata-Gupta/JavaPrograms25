package tasks.tasks;

import java.util.Scanner;

public class task2803_Pyramid_pattern_in_Java {
    public static void main(String[] args) {
     //      *
      //    ***
      //   *****
      //  *******
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
       int n=sc.nextInt();

        for (int i = 0; i <n ; i++)
        {
            for (int j=n;j>i;j--) {
                System.out.print(" ");

            }

            for (int k=0;k<i+1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();


            }

        }
    }

