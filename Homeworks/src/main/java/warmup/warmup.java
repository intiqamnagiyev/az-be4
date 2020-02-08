package warmup;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name=scanner.next();
        System.out.println("Hello "+name);
        System.out.println("Nice to meet you, "+name);
        System.out.println("Bye!");
    }
}
