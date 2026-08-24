package basics;

public class DivisionOfDataTypes {
    public static void main(String[] args) {
        double x = 5 / 2;
        System.out.println(x);//2.0

        double y = 5.0 /2.0;
        System.out.println(y); //2.5

        //wrong example
//        int p = 69, r = 5, t = 8;
//        double si = p*r*t/100;
//        System.out.println(si);

        //right example (we have to write number in decimal)
        int p = 69, r = 5, t = 8;
        double si = p*r*t/100.0;
        System.out.println(si);
    }
}
