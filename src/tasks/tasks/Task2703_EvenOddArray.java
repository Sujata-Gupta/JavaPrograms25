package tasks.tasks;

public class Task2703_EvenOddArray {
    public static void main(String[] args) {
        int[] num={12,234,12,65,2,67,99};
                for (int i:num)
                {
                    if(i%2==0)
                    {
                        System.out.println(i+" is even");
                    }
                    else
                        System.out.println(i+" odd");
                }
    }
}
