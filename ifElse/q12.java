package ifElse;

import java.util.Scanner;

public class q12 {
    //given a point (x,y) write a program to find if it lies in the 1st quadrant,
    //2nd quadrant, 3rd quadrant , 4th quadrant on the x-axis, y-axis or the origin
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) System.out.println("Origin");
        else if (x == 0) System.out.println("Y-axis");
        else if (y == 0) System.out.println("X-axis");
        else if (x > 0 && y > 0) System.out.println("1st quadrant");
        else if (x < 0 && y > 0) System.out.println("2nd quadrant");
        else if (x < 0 && y < 0) System.out.println("3rd quadrant");
        else {
            System.out.println("4th quadrant");

       }
    }
}
