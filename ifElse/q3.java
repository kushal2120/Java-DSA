package ifElse;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
    //take integer input and print the absolute value of that integer
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
//        if(n >= 0){
//            System.out.println(n);
//        }
//        else{
//            System.out.println(-n);
//        }
        if(n < 0) {
            n = -n;
        }
        System.out.println(n);
    }
}
