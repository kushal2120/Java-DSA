package loops;

public class q5 {
    public static void main(String[] args) {
        //table of 17
        //170 - 17 + 1 = 154 baar loop chal rha hai matlab 154 interation hai loop ke

        //bad logic
//        for (int i = 1; i <= 170; i++){
//            if (i % 17 == 0) System.out.println(i+ " ");
//        }

        //10 iterations hai loop me
//        for (int i = 17; i <= 170; i=i+17){
//            System.out.println(i + " ");
//        }

        for (int i = 1; i <= 10; i = i+1){
            System.out.println(i*18 + " ");
        }
    }
}
