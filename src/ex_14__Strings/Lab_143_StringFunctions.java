package ex_14__Strings;

public class Lab_143_StringFunctions {
    public static void main(String[] args) {
        String name = "Sujata";
        //length
        System.out.println(name.length());//6

        //charAt()
        System.out.println(name.charAt(3));//a
        //System.out.println(name.charAt(10)); //IndexOutOfBoundException

        //concatination
        System.out.println(name.concat(" Gupta"));//Sujata Gupta

        //contains()
        System.out.println(name.contains("a"));//true

        //equals()
        System.out.println(name.equals("sujata"));//false

        //equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sujata"));//true

        //indexOf()
        System.out.println(name.indexOf('u'));//1

        //replace()
        System.out.println(name.replace('a','j'));

        //split()
        String name1="sujata@gupta@31!2";
        String[] split=name1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //substring()

        System.out.println(name.substring(1,3));

        //toLowerCase

        System.out.println(name.toLowerCase());

        //toUpperCase

        System.out.println(name.toUpperCase());

        //startsWith()

        System.out.println(name.startsWith("S"));

        //endsWith()

        System.out.println(name.endsWith("a"));


        //trim()
        String s="   Sujata Gupta   ";
        System.out.println(s.trim());

        //compareTo();
        System.out.println(name.compareTo("Sujata"));

        //StringBuilder
        StringBuilder ac=new StringBuilder("SujataG");
        System.out.println(ac);

        String abc="lion roars in the jungle";
        String roar=abc.substring(5,9);
        System.out.println(roar);

        String s11="Anshul";
        String s12=s11.concat(" Srivastava");
        System.out.println(s12);



    }
}
