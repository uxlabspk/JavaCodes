

// Muhammad Naveed

// (Calculating the Product of Odd Integers) Write an application
// that calculates the product of the odd integers from 1 to 15.

public class Q_17
{
    public static void main(String[] args)
    {
        // initialize product as 1
        int product = 1;

        // looping from 1 to 15
        for (int i = 1; i <= 15; i++)
        {
            // if number is odd
            if (i % 2 != 0)
            {
                // product of odd numbers
                product *= i;
            }
        }

        // Printing the product on console.
        System.out.println("The product of odd numbers in between 1 - 15 is " + product);
    }
}
