
// Muhammad Naveed
// Arrays demonstration.

import java.util.Scanner;

public class Arrays 
{
    public static void main(String[] args) 
    {
        var s = new Scanner(System.in);
        // Creating new array.
        int[] myArray = new int[5];

        // Taking value from user and storing in array.
        System.out.println("Enter the values in array : ");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = s.nextInt();
        }

        s.close();

        // Printing the items of array.
        for (int values : myArray)
        {
            System.out.print(values + " ");
        }
    }    
}
