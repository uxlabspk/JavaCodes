

// Muhammad Naveed

// (Factorial) The factorial of a non-negative integer n is written as
// n! (pronounced “n factorial”) and is defined as follows: n! = n · (n – 1) · (n – 2) · … · 1
// (for values of n greater than or equal to 1) and n! = 1 (for n = 0)
// For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
// Write an application that reads a non-negative integer and computes and prints its factorial.

import java.util.Scanner;

public class Q_15
{
    private final Scanner sc = new Scanner(System.in);
    private int number = 0;
    public void getNumber()
    {
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        isValid();
    }

    private void isValid()
    {
        if (number >= 0)
        {
            factorial();
        }
        else
        {
            System.out.print("Invalid number! \nPlease try with some non-negative numbers.\n");
            getNumber();
        }
    }

    private void factorial()
    {
        long facto = 1;

        for (int i = number; i > 0; i--)
        {
            facto *= i;
        }

        System.out.println("The factorial of " + number + " is " + facto);
    }

    public static void main(String[] args)
    {
        Q_15 Obj = new Q_15();

        Obj.getNumber();
    }
}
