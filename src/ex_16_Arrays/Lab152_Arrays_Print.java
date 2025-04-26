package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int marks[]={88,77,56,98,86,46};

        for (int i=0;i<marks.length;i++)
        {
            System.out.print(" "+marks[i]);
        }

        Arrays.sort(marks);
        for (int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }


    }


}
