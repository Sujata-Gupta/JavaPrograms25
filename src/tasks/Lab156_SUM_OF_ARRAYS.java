package tasks;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] num={2,6,2,4,1,5};
        int sum=0;
        for (int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        System.out.println(sum);

        //for-each
        int sum1=0;
        for (int i:num)
        {
            sum1=sum1+i;
        }
        System.out.println(sum);
    }

}
