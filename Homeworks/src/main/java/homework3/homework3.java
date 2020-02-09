package homework3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";

        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";

        schedule[2][0] = "Thuesday";
        schedule[2][1] = "go to cinema";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "to do smth on wednesday";

        schedule[4][0] = "Thrusday";
        schedule[4][1] = "to do smth on Thrusday";

        schedule[5][0] = "Friday";
        schedule[5][1] = "to do smth on Friday";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "to do smth on Saturday";


        String dayOfWeek = "";

        while (true) {
            System.out.print("Please, input the day of the week: ");
            dayOfWeek = scanner.next().toLowerCase();

            if (dayOfWeek.equalsIgnoreCase("exit"))
                break;
            switch (dayOfWeek) {
                case "sunday":
                    System.out.println("do home work");
                    break;
                case "monday":
                    System.out.println("go to courses; watch a film");
                    break;
                case "thuesday":
                    System.out.println("go to cinema");
                    break;
                case "wednesday":
                    System.out.println("to do smth on wednesday");
                    break;
                case "thursday":
                    System.out.println("to do smth on thursday");
                    break;
                case "friday":
                    System.out.println("to do smth on friday");
                    break;
                case "saturday":
                    System.out.println("to do smth on saturday");
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
