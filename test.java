import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        // greating line...
        System.out.println("Hello and welcome to our CodeCamp.org ");
        // register the user
        String usrName, password, email;
        // scanner for user input
        Scanner s = new Scanner(System.in);
        // prompt for user name
        System.out.print("Enter your user name : ");
        // get user name
        usrName = s.next();
        // prompt for user password
        System.out.print("Enter your password : ");
        // get user password
        password = s.next();
        // prompt for email
        System.out.print("Enter your email address : ");
        // get email address
        email = s.next();
        // Closing the scanner.
        s.close();
        // validate input
        if (usrName != "" && password != "" && email != "")
        {
            System.out.println("\n-----------------------\nRegistration sucesfull\n-----------------------\n");
        }
        else
        {
            System.out.println("\n-----------------------\nRegistration failed\n-----------------------\n");
        }
    }
}