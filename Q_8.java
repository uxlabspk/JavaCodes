

// Muhammad Naveed

// (Find the Two Largest Numbers), find the two largest values of the 10 values entered.


public class Q_8
{
    public static void main(String[] args)
    {
        // ten values array
        int[] numbers = new int[] {3, 8, 1, 9, 5, 2, 7, 4, 6, 0};

        // let largest and leading largest numbers are at index 0 (value: 3)
        int largest = numbers[0];
        int leading_largest = numbers[0];
        int index = 0;

        // loop through the array to find the largest number.
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > largest)
            {
                largest = numbers[i];   // storing the largest number.
                index = i;              // storing the index of largest number also.
            }
        }

        numbers[index] = 0;     // turn the largest number to 0

        // Enhanced for loop for finding leading largest number.
        for (int num : numbers)
        {
            if (num > leading_largest)
            {
                leading_largest = num;
            }
        }

        System.out.println("The largest number is : " + largest);
        System.out.println("The second largest number is : " + leading_largest);
    }
}
