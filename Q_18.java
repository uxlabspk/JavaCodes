
// Muhammad Naveed

// (Perfect Numbers) An integer number is said to be a perfect number if its factors,
// including 1 (but not the number itself), sum to the number. For example,
// 6 is a perfect number, because 6 = 1 + 2 + 3. Write a method isPerfect that
// determines if parameter number is a perfect number. Use this method in an
// application that displays all the perfect numbers between 1 and 1000.
// Display the factors of each perfect number to confirm that the number
// is indeed perfect. Challenge the computing power of your computer by
// testing numbers much larger than 1000. Display the results.


public class Q_18
{
    public static void main(String[] args)
    {
        for (int num = 2; num < 1000; num++)
        {
            if (isPerfect(num))
            {
                System.out.println(num + " is perfect number.");
                System.out.print("Factors are : ");

                for (int i = 1; i < num; i++)
                {
                    if (num % i == 0)
                    {
                        System.out.print(i + " ");
                    }
                }

                System.out.println();
            }
        }
    }

    private static boolean isPerfect(int number)
    {
        int sum = 0;

        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                sum += i;
            }
        }

        return (number == sum);
    }
}
