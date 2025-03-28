package src;
// Muhammad Naveed

// (Sides of a Right Triangle) Write an application that reads
// three nonzero integers and determines and prints whether
// they could represent the sides of a right triangle.


import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        // Sides of triangle
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

        // taking squares of each side
        int SquareSideA = (sideA * sideA);
        int SquareSideB = (sideB * sideB);
        int SquareSideC = (sideC * sideC);

        // if triangle is right angle
        if ((SquareSideA + SquareSideB) == SquareSideC
                & (SquareSideA + SquareSideC) == SquareSideB
                & (SquareSideC + SquareSideB) == SquareSideA) {
            System.out.println("Could be a right angle triangle");
        } else {
            System.out.println("Not a right angle triangle");
        }
    }
}
