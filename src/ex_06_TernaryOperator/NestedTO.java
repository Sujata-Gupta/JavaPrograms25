package ex_06_TernaryOperator;

public class NestedTO {
    public static void main(String[] args) {


        int number = 25;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result);
    }
}