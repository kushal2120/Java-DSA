package loops;

public class q6 {
    public static void main(String[] args) {
        //print all odd numbers divisible by 3 from 1 to 100
        for(int i = 1; i <= 100; i=i+2){ //odd number
            if (i % 3 == 0) System.out.println(i);
        }
    }
}
