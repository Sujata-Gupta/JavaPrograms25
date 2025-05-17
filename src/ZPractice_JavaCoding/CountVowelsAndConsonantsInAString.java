package ZPractice_JavaCoding;

import java.util.Scanner;

public class CountVowelsAndConsonantsInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        CountVowelsAndConsonantsInAString str=new CountVowelsAndConsonantsInAString();
        str.countVowelsCons(s.toLowerCase());




    }
    public void countVowelsCons(String str) {
        int vCount = 0;
        int cCount = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if((ch >= 'a' && ch <= 'z')) {
                cCount++;
            }
        }
        System.out.println(vCount);
        System.out.println(cCount);
        //return new int[]{vCount, cCount};
    }
}

