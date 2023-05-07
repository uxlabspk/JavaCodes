
import java.util.Scanner;

public class Account 
{
    private String name;
    private double balance;   
    
    // default constructor.
    public Account()
    {
        name = "";
        balance = 0.0;
    }

    // parametrized constructor.
    public Account(String name, double balance)
    {
        this.name = name;
        if (balance > 0.0)
        {
            this.balance = balance;
        }
    }

    // deposite amount method.
    public void depositAmount(double amount)
    {
        if (amount > 0.0)
        {
            balance += amount;
        }
    }

    // withdraw method
    public void withdrawn(double amount)
    {
        if (amount > 0.0 && amount <= balance)
        {
            balance -= amount;
        }
        else 
        {
            System.out.println("\nWithdrawn amount exceed!.");
            System.out.println("Transaction failed.\n");
        }
    }

    // balance getter method
    public double getBalance()
    {
        return balance;
    }

    // name setter method 
    public void setName(String name)
    {
        this.name = name;
    }

    // name getter method 
    public String getName()
    {
        return name;
    }

    // main driven function.
    public static void main(String[] args) 
    {
        var input = new Scanner(System.in);

        var account = new Account(" ", 0);

        System.out.print("Enter your name : ");
        account.setName(input.nextLine());

        System.out.println("Your account balance is " + account.getBalance());

        System.out.print("Enter the amount to deposit in your account : ");
        account.depositAmount(input.nextDouble());

        System.out.println("Your new balance is : " + account.getBalance());

        System.out.print("Enter amount you wish to withdraw : ");
        account.withdrawn(input.nextDouble());

        System.out.println("Your new balance is : " + account.getBalance());

        input.close();
    }
}
