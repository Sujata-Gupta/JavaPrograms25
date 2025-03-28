package ex_04_operators;

public class Interview {
    public static void main(String[] args) {
        //1
        System.out.println(!(10>20));
        //2
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);
        //3
        int x = 10;
        boolean y = (10 == 11); // == -> Comparison 2 values
        System.out.println(x);
        System.out.println(y);
        //4
        char a1 = 'A'; // ASCII -> 65
        char b1 = 'B'; // 66
        System.out.println(a1 + b1);
        // a1+b1 - 65+66 -> 131

        //5
        System.out.println('A' == 65);

        //6

        short s = 10;
        char c = 'A';//65
        System.out.println(c+s);


    }
}
