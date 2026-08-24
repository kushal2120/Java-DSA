package basics;

public class arithmeticOperationAndDataTypes {
    public static void main(String[] args) {
        //integer data types
        int x = 39, y = 10;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); //3  why? - integer divides integer gives integer , after decimal it will be double
        // data types that's why output is 3 only

        //fixing above divide code with double data types which is used for decimal numbers
        double z = 39;
        double w = 10;
        System.out.println(z / w);

        //modulus operator = gives remainder by dividing two integers4;
        int a = 6;
        int b = 4;
        int c = a % b;
        System.out.println(c); //2
        //properties of modulus
        //a %  b = a (if a < b)
        //a % (-b) = a % b
        //(-a) % b = -(a % b)

    }
}
