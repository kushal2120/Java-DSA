package ifElse;


import java.util.Scanner;

public class q13 {
    //take 3 number input and print the greatest of them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd no: ");
        int c = sc.nextInt();

        if(a>=b){
            if(a>=c) System.out.println(a);
            else
                System.out.println(c);
        }
        else{
            if(b>=a) System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
