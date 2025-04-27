package tasks.tasks;

import java.util.Scanner;

public class Task1403_evenodd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a= sc.nextInt();
        sc.close();

        if(a%2==0)
        {
            System.out.println(a + " Number is even");
        }
        else
        {
            System.out.println(a+ " Number is odd");
        }
    }
}
