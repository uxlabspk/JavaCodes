

// Muhammad Naveed

// (Find the Smallest Value) Write an application that finds the smallest of
// several integers. Assume that the first value read specifies the
// number of values to input from the user.

import java.util.Scanner;

public class Q_16
{
    private int smallest;

    public void inputValues()
    {
        // taking input for how many numbers to compare
        System.out.print( "Enter the number of integer values to compare: " );

        // scanner object
        Scanner sc = new Scanner( System.in );
        int values = sc.nextInt();

        // let user enter two numbers which means we have to compare two numbers
        // so, we take these two number values.
        for (int i = 1; i <= values; i++ )
        {
            // taking numbers
            System.out.printf( "Enter an integer for value %d: ", i );
            int number = sc.nextInt();

            // finding the smallest number
            if ( i == 1 )
            {
                smallest = number;
            }
            smallest = (number < smallest) ? number : smallest;
        }
    }

    // display method
    public void displaySmallest()
    {
        System.out.printf( "\nThe smallest integer is %d\n\n", smallest );
    }
    public static void main(String[] args)
    {
        // creating an object
        Q_16 smallest = new Q_16();

        // calling relevant methods.
        smallest.inputValues();
        smallest.displaySmallest();
    }
}
