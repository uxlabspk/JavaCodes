package src;
// Muhammad Naveed
// src.Arrays demonstration.

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        // Creating new src.array.
        int[] myArray = new int[5];

        // Taking value from user and storing in src.array.
        System.out.println("Enter the values in src.array : ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = s.nextInt();
        }

        s.close();

        // Printing the items of src.array.
        for (int values : myArray) {
            System.out.print(values + " ");
        }
    }
}
