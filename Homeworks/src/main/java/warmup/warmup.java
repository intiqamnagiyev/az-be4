package warmup;

import java.util.Random;

public class warmup {
    public static void main(String[] args) {
        Random random = new Random();
        int max=11;
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(max);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
