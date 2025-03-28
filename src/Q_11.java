package src;
// Muhammad Naveed

// (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs
// an integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal
// equivalent. [Hint: Use the remainder and division operators to pick off the binary
// number’s digits one at a time, from right to left. In the decimal number system,
// the rightmost digit has a positional value of 1 and the next digit to the left a
// positional value of 10, then 100, then 1000, and so on. The decimal number 234 can be
// interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost
// digit has a positional value of 1, the next digit to the left a positional value of 2,
// then 4, then 8, and so on. The decimal equivalent of binary 1101 is
// 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]


import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        // scanner class object.
        Scanner sc = new Scanner(System.in);

        // creating src.variables of type long
        long binaryNumber, decimalNumber = 0, multipleOfTwo = 1, remainder;
        int count = 0;

        // taking src.input
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        sc.close();

        // Converting binary -> decimal
        while (binaryNumber != 0) {
            // 100
//            remainder = binaryNumber % 10;  // 1
//            decimalNumber = decimalNumber + remainder * multipleOfTwo; // 0 + 0 * 1 => 2
//            multipleOfTwo = multipleOfTwo * 2;  // 4
//            binaryNumber = binaryNumber / 10;   // 1
            remainder = binaryNumber % 10;
            decimalNumber = (long) (decimalNumber + remainder * Math.pow(2, count));
            count += 1;
            binaryNumber /= 10;
        }
        // Printing the decimal number
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
