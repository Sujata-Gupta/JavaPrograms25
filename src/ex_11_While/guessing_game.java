package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args) {
        Random random=new Random();
        int numbertoguess=random.nextInt(101);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int attempt=0;
        int guess;
        while (true)
        {
            guess=sc.nextInt();
            attempt++;
            if (guess>numbertoguess)
            {
                System.out.println("too high");
            }
            else if(guess<numbertoguess)
            {
                System.out.println("too low");
            }
            else{
                System.out.println("You got it");
                System.out.println("you got it in "+attempt+" attempts");
            break;
            }
        }



    }
}
