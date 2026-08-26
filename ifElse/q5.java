package ifElse;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //if cost price and selling price of an item is input through the keybpard, write a program to determine
        // whether the seller has made profit or incurred loss or no profit no loss. ALso determine how much profit
        // he made or loss he incurred,
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cp: ");
        int cp = sc.nextInt();//cost price
        System.out.print("Enter Sp: ");
        int sp = sc.nextInt();//selling price

//        if(sp > cp){
//            System.out.println("Profit is: " + (sp - cp));
//        }
//        if(cp > sp){
//            System.out.println("Loss is: " + (cp - sp));
//        }
//        if(sp == cp){
//            System.out.println("No profit No loss");
//        }
        //other method
        if(sp > cp){
            System.out.println("Profit is: " + (sp - cp));
        }
        else if(cp > sp){
            System.out.println("Loss is: " + (cp - sp));
        }
        else{
            System.out.println("No profit No loss");
        }
    }
}
