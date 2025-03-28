package src;

// Muhammad Naveed

// (Validating User Input), For any src.input, if the value entered is other than 1 or 2,
// keep looping until the user enters a correct value.

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        // scanner class object.
        Scanner sc = new Scanner(System.in);
        int value = 0;

        // loop until user enters value 1 or 2.
        while (value != 1 & value != 2) {
            System.out.print("Enter any value : ");
            value = sc.nextInt();
        }

        // closing the scanner object to avoid potential memory leakage.
        sc.close();
    }
}
