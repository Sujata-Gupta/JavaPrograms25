package ex_30_Exceptions;

public class Lab235_Custom_Exception_Example {
    public static void main(String[] args) {
        Bank sbi=new Bank();
        sbi.setAmount(500);
        sbi.setCurrency("INR");

        Bank BOB=new Bank();
        BOB.setAmount(800);
        BOB.setCurrency("INR");

        Bank JP=new Bank();
        JP.setAmount(32);
        JP.setCurrency("USD");

        int total=sbi.add(BOB);
        System.out.println(total);




    }

}

