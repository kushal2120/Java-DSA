package basics;

public class charDataTypes {
    public static void main(String[] args) {
        //storing characters
        char som = 's';
        System.out.println(som);
        char adi = 'e';
        System.out.println(adi);
        char eva = '+';
        System.out.println(eva);

        //ASCII values
        //a - 97, b - 98, c - 99, ..... z - 122
        //A - 65, B - 66, C - 67, ......Z - 90
        //0 - 48, 1 - 49, 2 - 50, ......9 - 57

        //typecasting - ek datatype se durse data data type conversion
//        char ch = 'A';
//        int x = ch; //implicit typecasting
//        System.out.println(x);

        //another method
//        char piyush = 'a';
//        int y = (int)piyush;//explicit typecasting
//        System.out.println(y);
//
//        char p = '3';
//        int i = (int)p;
//        System.out.println(i);

        //another method
//        char h = 'b';
//        System.out.println(h+0);
//        System.out.println(h*1);

        //integer to character
        int x = 39;
        char ch = (char)x;
        System.out.println(ch);

    }
}
