package src;

// Muhammad Naveed

// (Palindromes) A palindrome is a sequence of characters that reads the same
// backward as forward. For src.example, each of the following five-digit integers
// is a palindrome: 12321, 55555, 45554 and 11611. Write an application that reads
// in a five-digit integer and determines whether it’s a palindrome.
// If the number is not five digits long, display an error message and allow the user
// to enter a new value.


import java.util.Scanner;

public class Q_10 {
    private int number = 0;
    private final Scanner sc = new Scanner(System.in);

    // getting user src.input method
    public void readNumber() {
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        //sc.close();
        validateNumber();
        sc.close();
    }

    // validating user src.input method
    private void validateNumber() {
//        if ((number >= 10000) && (number <= 99999))
//        {
//            System.out.println(isPalindrome());
//        }
//        else
//        {
//            System.out.println("Invalid src.input! \nPlease try again");
//            readNumber();
//        }
        String str = Integer.toString(number);
        if (str.length() == 5) {
            System.out.println(isPalindrome());
        } else {
            System.out.println("Invalid src.input! \nPlease try again");
            readNumber();
        }
    }

    // Palindrome number finder method
    private String isPalindrome() {
        int originalNumber = number;
        int reverse = 0;
        int rem;

        // reversing the integer number like 123 => 321
        while (number != 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number /= 10;
        }

        // returning the string you may also change the return type to void
        // and print these strings rather than returning.
        if (reverse == originalNumber) {
            return "The given number is palindrome number";
        } else {
            return "The given number is not palindrome number";
        }


    }

    // main driven method.
    public static void main(String[] args) {
        // creating the object.
        Q_10 obj = new Q_10();

        obj.readNumber();
    }
}
