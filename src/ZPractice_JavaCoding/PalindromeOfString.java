package ZPractice_JavaCoding;

import java.util.Scanner;

public class PalindromeOfString {
    public static void main(String[] args) {
//        String s="matam";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();

       String reverse="";

        for (int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);


       /* StringBuilder sk=new StringBuilder("indni");
        sk.reverse();*/
        if (s.equalsIgnoreCase(reverse))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        sc.close();


    }
}
