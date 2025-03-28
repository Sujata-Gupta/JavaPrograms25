package ex_03_Literals;

public class lab_literals {
    public static void main(String[] args) {

            int local;
            local = 10;
            System.out.println(local);

            final float PI = 3.14f;
            // PI = 3.13f; This is final in nature.
            System.out.println(PI);

        // Literal
        int age = 65;
        age = 66;

        // Constant
        final int girl_age = 18;
        //girl_age = 19;

        float pi2 = 3.14F;
        float x = 10.00f;

        boolean is_married = true;
        boolean is_married_amit = false;

        int age1 = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10

        // Octal base? -> 8
        int octal = 0101;


        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745


        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is string

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println("Pramod is old"+carriage_return+"Dutta");

        char c3 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60'; //unicode

    }

}
