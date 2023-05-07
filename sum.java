import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int first = 0, second = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        first = s.nextInt();
        System.out.print("Enter the second number : ");
        second = s.nextInt();
        sum = first + second;
        System.out.println("The sum of " + first + " and " + second + " is : " + sum);
        s.close();
    }
}