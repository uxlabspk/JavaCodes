
// Muhammad Naveed

// (Odd or Even) Write an application that reads an integer and determines
// and prints whether it’s odd or even.
// [Hint: Use the remainder operator. An even number is a multiple of 2.
// Any multiple of 2 leaves a remainder of 0 when divided by 2.]


import java.util.Scanner;

public class Q_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        sc.close();

//        String str = (number % 2 == 0) ? "even number" : "odd number";

//        System.out.println(str);
        System.out.println((number % 2 == 0) ? "even number" : "odd number");
    }
}
