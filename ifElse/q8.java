package ifElse;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        //take positive integer input and tell if it is divisible by 5 or 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n % 5 == 0 || n % 3 == 0) {
            System.out.println("Divisible by 5 or 3");
        }
        else {
            System.out.println("Not divisible by 5 or 3");
        }
    }
}
