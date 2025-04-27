package tasks.tasks;

import java.util.Scanner;

public class Task1303_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.print("Enter your number out of 100");
int num= sc.nextInt();
//- result = condition ? expression1 : expression2;

String grade = num>=90 ? "A" : (num>80) ? "B" : "c";
                System.out.println(grade);


    }
}
