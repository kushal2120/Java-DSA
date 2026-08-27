package ifElse;


import java.util.Scanner;

public class ternaryOperatorBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int n = sc.nextInt();

//        if(n % 2 == 0) {
//            System.out.print("Even Number");
//        }
//        else{
//            System.out.println("Odd Number");
//        }

        //condition ? sach : jhoot
        System.out.println((n%2 == 0) ? "Even" : "Odd");
    }
}
