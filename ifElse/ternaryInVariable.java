package ifElse;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int kushal = (n>=0) ? 100 : 0;
        System.out.println(kushal);
    }
}
