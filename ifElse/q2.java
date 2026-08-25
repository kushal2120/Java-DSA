package ifElse;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        //take positive integer input and tell if it is divisible by 5 or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n % 5 == 0){
            System.out.println("It is divisibl by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
