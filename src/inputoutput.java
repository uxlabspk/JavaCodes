package src;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        int numb;
        long fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to find src.factorial : ");
        numb = s.nextInt();
        s.close();
        for (int i = numb; i > 0; i--) {
            fact *= i;
        }
        System.out.println("The Factorial of " + numb + " is : " + fact);
    }
}