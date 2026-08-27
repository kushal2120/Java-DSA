package ifElse;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        //take length and breadth of rectangle as input and write a program to find whether the area of rectangle is
        // greater than its perimeter
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        double areaOfRectangle = length*breadth;
        double perimeter = 2*(length*breadth);

        if(areaOfRectangle > perimeter) {
            System.out.println("Area is greater than perimeter");
        }else {
            System.out.println("Area is not greater than perimeter");
        }

    }
}
