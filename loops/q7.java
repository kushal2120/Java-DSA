package loops;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        //print numbers from n to 1 (decrement loop)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
}
