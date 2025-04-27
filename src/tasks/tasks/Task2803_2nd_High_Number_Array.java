package tasks.tasks;

import java.util.Arrays;

public class Task2803_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] num={2,4,3,6,7,1,9};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);

    }


}
