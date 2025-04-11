package ex_09_Switch;

import java.util.Scanner;

public class Real_Use_Switch {

    public static void main(String[] args) {

//        String browser=args[0];
//        System.out.println(browser);

        Scanner sc=new Scanner(System.in);
        String browser=sc.next();

        switch (browser)
        {
            case "chrome":
                System.out.println("Starting TC");
                System.out.println(".....");
                System.out.println("TC1");

            case "edge":
                System.out.println("Starting TC");
                System.out.println(".....");
                System.out.println("TC2");

            default:
                System.out.println("Starting TC");
                System.out.println(".....");
                System.out.println("This is invalid");





        }

    }
}

