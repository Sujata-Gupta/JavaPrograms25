package ex_04_operators;

public class Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Sujata";
        String last_name = "Gupta";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
