

// Muhammad Naveed

// (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in
// the command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64,
// and so on. Your loop should not terminate (i.e., it should create an infinite loop).
// What happens when you run this program?


public class Q_12
{
    public static void main(String[] args)
    {
        int number = 1;
        // looping through infinite loop

        while (true)
        {
            // creating multiplication of 2 like : 2, 4, 8, 16, 32, ...
            number *= 2;
            System.out.print(number + ", ");    // printing the numbers.
        }

        // When we run our program it should print the 31 correct values up to 1073741824. Then, our program prints 0 on the console
        // for infinite time.
    }
}
