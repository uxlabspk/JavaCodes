import java.util.Scanner;


public class facto
{
    private int number;
    private int factorial;

    public facto()
    {
        number = 0;
        factorial = 1;
    }

    public void getNumber()
    {
        System.out.print("Enter the number : ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        s.close();
        calFactorial();
    }

    public void calFactorial()
    {
        for (int i = number; i > 0; i--)
        {
            factorial *= i;
        }
    }
    public int getFactorial()
    {
        return factorial;
    }

    public static void main(String[] args) 
    {
        facto f = new facto();

        f.getNumber();
        System.out.println("The factorial of " + f.number + " is : " + f.getFactorial());
    }
}