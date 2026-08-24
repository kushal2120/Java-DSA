package basics;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in); //for taking input from user

        //System.out.print("Enter radius: ");
        //double r = sc.nextDouble();
        //double a = 3.141 * r * r;
        // System.out.println("Area is: " + a);

        //sqaure of a number
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter sides: ");
        //int s = sc.nextInt();
        //int square = s * s;
        //System.out.println("Sqaure: " + square);

        //take 2, 3 numbers input and print their sum
        //Scanner kushal = new Scanner(System.in);

        //System.out.println("Enter first number: ");
        //int x = kushal.nextInt();
        //System.out.println("Enter second number: ");
        //int y = kushal.nextInt();
        //System.out.println("Enter third number: ");
        //int z = kushal.nextInt();

        //System.out.print("Sum: ");
        //System.out.println( x + y + z);

        //simple interest
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double si = p*r*t/100;
        System.out.println("Simple interest: ");
        System.out.println(si);
    }
}
