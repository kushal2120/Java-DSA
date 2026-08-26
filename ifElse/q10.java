package ifElse;


import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        //take positive integer input and print:
        //riya if no. is divisible by 5
        //banu if no. is divisible by 3
        //apoorva if no. is divisible by 5 & 3 both
        //isha if no. is not divisible by 5 or 3
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n%5 == 0 && n%3 == 0){
            System.out.println("apporva");
        } else if (n%3 == 0) {
            System.out.println("Banu");
        } else if (n%5 == 0) {
            System.out.println("Riya");
        } else{
            System.out.println("Isha");

            }
        }
    }
