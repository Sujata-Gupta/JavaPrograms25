package tasks;

import java.util.Scanner;

public class Task1403_TriangleClassifier {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a==b && b==c)
        {
            System.out.println("equilateral Trianlge");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("isoceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }

    }
}
