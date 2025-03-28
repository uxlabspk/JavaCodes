package src;

import java.util.Scanner;

public class TextIO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double d;
        System.out.print("Enter the d : ");
        d = s.nextDouble();
        s.close();
        System.out.print("The value of d is : " + d);
    }
}