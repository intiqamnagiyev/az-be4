package homework2;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    private static Object[][] generateArray() {
        Object[][] arr = new Object[6][6];
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {
                if (i == 0) {
                    arr[i][j] = j;
                } else if (j != 0) {
                    arr[i][j] = "-";
                } else {
                    arr[i][j] = i;
                }

            }
        }
        return arr;
    }

    private static void printInitArray(Object[][] arr) {
        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 6; k++) {
                System.out.print(arr[j][k] + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomRow = random.nextInt(5);
        int randomBar = random.nextInt(5);
        randomRow++;
        randomBar++;

        System.out.println(randomRow);
        System.out.println(randomBar);

        Object[][] arr = generateArray();

        printInitArray(arr);
        System.out.println("======");
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            int enteredRow , enteredBar ;
            do {
                System.out.print("enter the line number between 1-5: ");
                enteredRow = scanner.nextInt();

                System.out.print("enter the bar number between 1-5: ");
                enteredBar = scanner.nextInt();


            } while (enteredRow <= 0 || enteredRow >= 6 || enteredBar <= 0 || enteredBar >= 6);
            if (enteredRow == randomRow && enteredBar == randomBar) {
                arr[randomRow][randomBar] = "x";
            } else {

                arr[enteredRow][enteredBar] = "*";
            }
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    System.out.print(arr[j][k] + "|");
                }
                System.out.println();
            }
            if (enteredRow == randomRow && enteredBar == randomBar) {
                System.out.println("You have won!");
                break;
            }

        }
    }
}
