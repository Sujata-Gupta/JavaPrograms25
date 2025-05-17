package ZPractice_JavaCoding;

import java.util.Scanner;

public class Prime_Number_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        Prime_Number_Checker p=new Prime_Number_Checker();
        p.prime(num);
    }

    public void prime(int n)
    {
        if (n <= 1) {
            System.out.println("no");  // 0 and 1 are not prime
            return;
        }
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("no");
        }

//        // Check divisibility from 1 to sqrt(n)
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//                break;  // No need to continue if a divisor is found
//            }
//        }
//
//        if (count == 0) {
//            System.out.println("prime");
//        } else {
//            System.out.println("no");
//        }
    }


}
