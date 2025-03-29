package tasks;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side");
        int a=sc.nextInt();
        System.out.println("Enter second side");
        int b=sc.nextInt();
        System.out.println("Enter third side");
        int c=sc.nextInt();

        if (a == b && a==c && c==b)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (a==b || a==c || b==c) {
            System.out.println("Isoceles Triangle");

        } else if (a!=b && a!=c && b!=c)
        {
            System.out.println("scalene");
        }


    }
}
