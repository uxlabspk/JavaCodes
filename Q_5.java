

// Muhammad Naveed

// (Separating the Digits in an Integer) Write an application that inputs one number
// consisting of five digits from the user, separates the number into its
// individual digits and prints the digits separated from one another by three
// spaces each. For example, if the user types in the number 42339, the program should print
//              4	2	3	3	9
// Assume that the user enters the correct number of digits. What happens when you
// execute the program and type a number with more than five digits? What happens
// when you execute the program and type a number with fewer than five digits?
// [Hint: It’s possible to do this exercise with the techniques you learned in
// this chapter. You’ll need to use both division and remainder operations to
// “pick off ” each digit.]

import java.util.Scanner;

public class Q_5
{
    public static void main(String[] args)
    {
        // Scanner class object
        Scanner sc = new Scanner(System.in);


        int num = 0;	// user input

        // taking user input
        System.out.print("Enter a number with five digits: ");
        num = sc.nextInt();

        // Make sure number is five digits only.
        if ( (num >= 10000) && (num <= 99999) )
        {
            System.out.printf("%d   ", (num / 10000));
            System.out.printf("%d   ", (num / 1000) % 10);
            System.out.printf("%d   ", (num / 100) % 10);
            System.out.printf("%d   ", (num % 100) / 10);
            System.out.printf("%d   ", (num % 10));
        }

        // if entered number more than five digits
        if (num > 99999)
        {
            System.out.println("You entered a number with more than five digits.");
        }

        // if entered number less than five digits
        if (num <= 9999)
        {
            System.out.println("You entered a number less than five digits.");
        }
    }
}
