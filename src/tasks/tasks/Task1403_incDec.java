package tasks.tasks;

public class Task1403_incDec {
    public static void main(String[] args) {

        int a = 10;

       System.out.println(++a + a++ + a++); //11 + 11 + 12

       System.out.println(a);//13

        int b = 20;
        System.out.println(--b + b++ + b--); //19 + 19 + 20
        System.out.println(b); //19

    }
}
