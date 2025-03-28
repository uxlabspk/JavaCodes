package src;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter day number : ");
        int dayNumber = s.nextInt();
        s.close();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number! ");
        }
    }
}
