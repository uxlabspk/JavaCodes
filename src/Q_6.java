package src;
// Muhammad Naveed

// (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
// and prints the number of negative numbers src.input, the number of positive numbers
// src.input and the number of zeros src.input.


import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number : ");
            numbers[i] = sc.nextInt();
        }

        for (int value : numbers) {
            if ((value > 0)) {
                ++positive;
            }

            if ((value < 0)) {
                ++negative;
            }

            if ((value == 0)) {
                ++zero;
            }
        }

        System.out.println("Positive => " + positive);
        System.out.println("Negative => " + negative);
        System.out.println("Zero     => " + zero);
    }
}
