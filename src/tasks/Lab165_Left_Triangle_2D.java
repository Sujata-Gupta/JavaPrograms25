package tasks;

import java.util.Scanner;

public class Lab165_Left_Triangle_2D {
    public static void main(String[] args) {
//        ****
//        ***
//        **
//        *

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            for (int j=i;j>=0;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
