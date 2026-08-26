package ifElse;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        //take real number input and check if it is an integer or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextDouble(); //n = 3.145
        int x = (int)n; // x = 3
        if(n-x == 0){
            System.out.println("is an integer");
        }
        else{
            System.out.println("is not an integer");
        }
    }
}
