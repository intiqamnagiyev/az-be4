package warmup;

import java.util.Scanner;

public class lesseon3warmUp {
    private static boolean isShoulBeFill(int i, int height, int width, int j, int tan) {
        return i == 0 || i == height - 1 ||
                j == 0 || j == width - 1 || j == (i * tan) || (width - 1 - j) == i * tan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter width:");
        int width = scanner.nextInt();
        System.out.print("enter height:");

        StringBuilder envelope = new StringBuilder();
        int height = scanner.nextInt();
        int tan = (width - 1) / (height - 1);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (isShoulBeFill(i, height, width, j, tan)) {
                    envelope.append("*");
                } else
                    envelope.append(" ");
            }
            envelope.append("\n");
        }
        System.out.println(envelope);
    }
}
