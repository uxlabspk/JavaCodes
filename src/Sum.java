package src;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        double firstNumber, secondNumber, sumOfNumbers;

        System.out.print("Enter src.first number : ");
        firstNumber = input.nextDouble();

        System.out.print("Enter second number : ");
        secondNumber = input.nextDouble();

        input.close();

        sumOfNumbers = firstNumber + secondNumber;

        System.out.println("The src.sum of both numbers is : " + sumOfNumbers);
    }
}
