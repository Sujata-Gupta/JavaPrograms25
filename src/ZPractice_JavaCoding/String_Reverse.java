package ZPractice_JavaCoding;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String rev=sc.nextLine();
        String_Reverse s=new String_Reverse();
        s.reverseString(rev);
    }

    public void reverseString(String s)
    {
        String[] words=s.split(" ");
        String reverseString=" ";
        for(String w:words)
        {
            String reverseword="";
            for(int i=w.length()-1;i>=0;i--)
            {
                reverseword=reverseword+w.charAt(i);


            }
            reverseString=reverseString+reverseword+" ";
        }
        System.out.println(reverseString);
    }
}
