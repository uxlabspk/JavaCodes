import java.util.Scanner;

class first
{
    static void factorial(int num)
    {
        int facto = 1;
        for(int i = num; i > 0; i--)
        {
            facto*=i;
        }

        System.out.print("factorial of " + num + " is " + facto);
    }

    public static void main(String[] args) 
    {
        var s = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter the value of i : ");
        i = s.nextInt();
        s.close();
        System.out.print("The square of " + i + " is " + (i*i) + "\n");
        factorial(i);
    }
}