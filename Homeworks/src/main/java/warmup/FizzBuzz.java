package warmup;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main1(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz");
            } else {
                System.out.print(" " + i);
            }
        }

    }

    public static void main2(String[] args) {
        int[] arr = new int[30];
        Random random = new Random();
        int max = 100;
        int min = -100;
        for (int i = 0; i < arr.length; i++) {
            int randNum = random.nextInt(max - min) + min;
            System.out.print(randNum + " ");

            arr[i] = randNum;
        }
        System.out.println();
        System.out.print("positive even: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("positive odd: ");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 1) {
                System.out.print(arr[j] + " ");
            }
        }
        System.out.println();
        System.out.print("negative even: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("negative odd: ");
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] % 2 == -1) {
                System.out.print(arr[k] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[30];
        int max = 100;
        int min = -100;
        int count_pe = 0, count_po = 0, count_ne = 0, count_no = 0;
        for (int i = 0; i < arr.length; i++) {
            int randNum = random.nextInt(max - min) + min;
            arr[i] = randNum;
            if (randNum % 2 == 0 && randNum > 0) {
                count_pe++;
            } else if (randNum % 2 == 1) {
                count_po++;
            } else if (randNum % 2 == 0 && randNum < 0) {
                count_ne++;
            } else if (randNum % 2 == -1) {
                count_no++;
            }
        }
        int[] PE = new int[count_pe];
        int[] PO = new int[count_po];
        int[] NE = new int[count_ne];
        int[] NO = new int[count_no];


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0 && arr[i] > 0) {
                PE[PE.length-count_pe--] = arr[i];

            }
            else if (arr[i] % 2 == 1) {
                PO[PO.length-count_po--] = arr[i];

            } else if (arr[i] % 2 == 0 && arr[i] < 0) {
                NE[NE.length-count_ne--] = arr[i];

            } else if (arr[i] % 2 == -1) {
                NO[NO.length-count_no--] = arr[i];

            }
        }
        String PosEve= Arrays.toString(PE);
        System.out.println("PosEve->"+PosEve);

        String PosOdd=Arrays.toString(PO);
        System.out.println("PosOdd->"+PosOdd);

        String negEv=Arrays.toString(NE);
        System.out.println("negEv->"+negEv);

        String negOdd=Arrays.toString(NO);
        System.out.println("negOdd->"+negOdd);
    }
}

