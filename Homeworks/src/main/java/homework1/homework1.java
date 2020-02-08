package homework1;

import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        int hiddenNum = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[101];
        System.out.println("hidden number: " + hiddenNum);
        System.out.print("Please enter your name:");
        String playerName = scanner.next();
        System.out.println("Let the game begin!");
        int i = 0, countOfEnteredNums = 0;

        while (true) {
            countOfEnteredNums++;
            System.out.print("enter num:  ");
            int playersNum = scanner.nextInt();

            arr[i] = playersNum;
            i++;
            if (playersNum == hiddenNum) {
                System.out.println("Congratulations " + playerName + "!");
                System.out.print("Your numbers:");

                for (int j = 0; j < countOfEnteredNums; j++) {
                    System.out.print(arr[j] + " ");
                }

                break;
            } else if (hiddenNum > playersNum) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }
    }
}
