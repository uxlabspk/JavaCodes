



public class gradeArray 
{
    public static void main(String[] args) 
    {
        System.out.println("Grade Distribution : ");    
        
        // Array storing stars counts.
        int [] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        // Loop for iterating over the array
        for (int counter = 0; counter < array.length; counter++)
        {
            // if counter is 10 print 100
            if (counter == 10)
            {
                System.out.printf("%8d", 100);
            }
            // else print the 00 - 09 sequence.
            else 
            {
                System.out.printf("%02d - %02d", (counter * 10), (counter * 10 + 9));
            }
            // loop for printing the starts
            for (int star = 0; star < array[counter]; star++)
            {
                System.out.print("*");
            }
            // just for line breaking.
            System.out.println();
        }
    }    
}
