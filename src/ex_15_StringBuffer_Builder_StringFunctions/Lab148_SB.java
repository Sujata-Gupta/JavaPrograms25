package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuilder sv=new StringBuilder("asdaw sad asd asw d d");
        System.out.println(sv.delete(10,13));
        System.out.println(sv.replace(2,6,"mnbv"));

    }
}
