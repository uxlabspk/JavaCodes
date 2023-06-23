
// Muhammad Naveed

// (Multiples) Write an application that reads two integers,
// determines whether the first is a multiple of the second and
// prints the result. [Hint: Use the remainder operator.]


import java.util.Scanner;

public class Q_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int numb1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int numb2 = sc.nextInt();

        String str = (numb2 % numb1 == 0) ? "Is multiple" : "Is not multiple";

        System.out.println(str);
    }
}
