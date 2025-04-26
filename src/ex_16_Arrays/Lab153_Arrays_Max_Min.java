package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] a = {12, 43, 4, 122, 1242, 56};
        int min_num= getMin(a);
        int max_num= getMax(a);
        System.out.println(min_num);
        System.out.println(max_num);
    }
    public static int getMax(int a[])
    {
        int max=a[0];
        for (int i=0;i<a.length;i++)
        {
           if(a[i]>max)
           {
               max=a[i];
           }
    }
    return max;
    }


    public static int getMin(int a[])
    {
        int min=a[0];
        for (int j=0;j<a.length;j++)
        {
            if(a[j]<min)
            {
                min=a[j];
            }
        }
        return min;
    }



        }
