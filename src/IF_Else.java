package src;
// Muhammad Naveed
// If Else demonstration

import java.util.Scanner;


public class IF_Else {
    public static void main(String[] args) {
        var s = new Scanner(System.in);

        System.out.print("Enter the temperature value : ");
        int temp = s.nextInt();

        s.close();

        if (temp > 30) {
            System.out.println("It's a hot day,");
            System.out.println("Drink plenty of water.");
        } else if (temp > 20) {
            System.out.println("It's a nice day.");
        } else {
            System.out.println("It's a cold day.");
        }
    }
}
