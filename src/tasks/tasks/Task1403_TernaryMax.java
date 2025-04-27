package tasks.tasks;

public class Task1403_TernaryMax {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        String result= a>b ? "a is maximum":"b is maximum";
        System.out.println(result);
    }
}
