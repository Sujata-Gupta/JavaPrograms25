package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        for (int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();

        }
        System.out.println("array");
        for (int j=0;j<num.length;j++)
        {
            System.out.println(num[j]);
        }

    }
}
