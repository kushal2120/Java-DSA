package loops;


import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        //print kushal n times. take n input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("kushal");
        }
    }
}