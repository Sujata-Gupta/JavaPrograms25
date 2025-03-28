package ex_06_TernaryOperator;

public class MaxNum {
    public static void main(String[] args) {

        int a=87;
        int b=75;
        int c=52;
        String max_num = (a>b) ? ( (a>c) ? "a is greatest" : "c is greatest") : "b is greatest";
//        String max_num = (a>b) ? ( (a>c) ? "a is greatest" : "c is greatest") : (b>c ? "b is greatest" :"c is greatest");
        System.out.println(max_num);


    }
}
