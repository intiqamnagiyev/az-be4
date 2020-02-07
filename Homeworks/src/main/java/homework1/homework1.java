package homework1;

import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        int x = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        Integer [] arr = new Integer[101];
        System.out.println("hidden number: "+x);
        System.out.print("Please enter your name:");
        String playerName = scanner.next();
        System.out.println("Let the game begin!");
        int i = 0,countOfEnteredNums=0;
        boolean flag = true;
        while (flag) {
            countOfEnteredNums++;
            System.out.print("enter num:  ");
            int y = scanner.nextInt();

            arr[i] = y;
            i++;
            if (y == x) {

                System.out.println("Congratulations " + playerName+"!");
                System.out.print("Your numbers:");

                for (int j = 0; j <countOfEnteredNums ; j++) {
                    System.out.print(arr[j]+" ");
                }
                flag = false;
            } else if (x > y) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }
    }
}
