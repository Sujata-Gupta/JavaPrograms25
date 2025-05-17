package ZPractice_JavaCoding;

import java.util.Arrays;

public class reversenum {
    //string = 01230045006

//output: 00000123456


    public static void main(String[] args) {
        String s="01230045006";
        char[] num=s.toCharArray();
        Arrays.sort(num);
        String sorted=new String(num);
        System.out.println(sorted);
    }
}
