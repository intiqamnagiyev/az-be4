package warmup;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scanner.next();
        System.out.println("Hello "+name+"\nNice to meet you, "+name+"\nBye!");
        System.out.println("please enter your age ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("go can to cinema");
        } else {
            System.out.println("you can go to night club");
        }
    }
}
