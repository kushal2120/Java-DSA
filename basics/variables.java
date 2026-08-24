package basics;

public class variables {
    public static void main(String[] args) {
        int x = 5;
        //changing value of x or updating
        x = 7;
        System.out.println(x);
        int y; //declaration
        y = 20; //initialization
        System.out.println("number: " + y );

        //modifying values
        int z = 7;
        System.out.println(z);
        z = z - 2;
        System.out.println(z);
        z = z + 20;
        System.out.println(z);
        z = z - 30;
        System.out.println(z);
        z = z * 10;
        System.out.println(z);
        z = z / 25;
        System.out.println(z);

        //variable naming rule
        //1.variable can start with alphabet
        int raghav = 100;
        int guddu = 99;
        //2.we can use _, $ but no numbers
        int _1x = 100;
        int $1x = 100;
//      nt 1x = 100;  // shows error
        //3. no gap between  characters
        //4.no keywords like
//        int class = 3; //error

    }
}
