package ifElse;


import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        //take 3 positive integer input and tell if they can be the sides of a triangle
        //a+b>c, b+c>a, c+a>b
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side: ");
        int c = sc.nextInt();

        if(a+b > c && b+c > a && c+a >= b){
            System.out.println("Valid traingle");
        }
        else{
            System.out.println("Invalid triangle");
        }
    }
}

