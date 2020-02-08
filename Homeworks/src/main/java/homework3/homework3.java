package homework3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";

        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";

        scedule[2][0] = "Thuesday";
        scedule[2][1] = "go to cinema";

        scedule[3][0] ="Wednesday";
        scedule[3][1] ="to do smth on wednesday";

        scedule[4][0] ="Thrusday";
        scedule[4][1] ="to do smth on Thrusday";

        scedule[5][0] ="Friday";
        scedule[5][1] ="to do smth on Friday";

        scedule[6][0] ="Saturday";
        scedule[6][1] ="to do smth on Saturday";


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
