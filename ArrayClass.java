import java.util.Arrays;

public class ArrayClass 
{
    public static void main(String[] args) 
    {
        // Creating an array
        int[] myArray = {23, 32, 29, 72, 55};

        // Printing the myArray using Arrays class
        System.out.println(Arrays.toString(myArray));
        
        // Sorting the array
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
