package tasks;

import java.util.Scanner;

public class Task2103_Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character");
        String character=sc.next();
        String reverse="";
        for (int i=character.length()-1;i>=0;i--)
        {
            char ab=character.charAt(i);
            reverse=reverse+ab;

        }
        System.out.println(reverse);

        if (character.equals(reverse))
        {
            System.out.println("String is palindrome");
        }
        else
            System.out.println("not palindrome");


    }

}
