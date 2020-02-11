package warmup;

import java.util.Scanner;

public class lesseon3warmUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width:");
        int width = scanner.nextInt();
        System.out.println("enter height:");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 ||
                        j == 0 || j == width - 1) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else if (i + j == width - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
        }
    }
}
