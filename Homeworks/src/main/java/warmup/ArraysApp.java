package warmup;

import java.util.Random;

public class ArraysApp {
    public static void main1(String[] args) {

        int max = 10;


        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            int r = (int) (Math.random() * max + 1);
            a[i] = r;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }



}
