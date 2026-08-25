package ifElse;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        //take positive integer input and tell if tit odd or even
        Scanner sc = new Scanner(System.in);
        System.out.print("Even Number: ");
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.print("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
