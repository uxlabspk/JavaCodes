package src;

import java.util.Scanner;

public class switchCondition {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int number = input.nextInt();

        input.close();

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Other than one to five.");
                break;
        }
    }
}
