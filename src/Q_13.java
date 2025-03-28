package src;

// Muhammad Naveed

// (Sides of a Triangle) Write an application that reads three
// nonzero values entered by the user and determines and prints
// whether they could represent the sides of a triangle.


import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        // sides of the triangle
        int sideA, sideB, sideC;

        // scanner object
        Scanner sc = new Scanner(System.in);

        // taking src.input
        System.out.print("Enter src.first side : ");
        sideA = sc.nextInt();

        // taking src.input
        System.out.print("Enter second side  : ");
        sideB = sc.nextInt();

        // taking src.input
        System.out.print("Enter third side : ");
        sideC = sc.nextInt();

        // closing the scanner
        sc.close();

        if (sideA == sideB & sideA == sideC & sideC == sideB) {
            System.out.println("Could be a triangle");
        } else {
            System.out.println("Not a triangle");
        }
    }
}
