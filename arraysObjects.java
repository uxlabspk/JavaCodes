

public class arraysObjects 
{
    public static void main(String[] args) 
    {
        int[] starCounts = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        for (int i = 0; i < starCounts.length; i++)
        {
            if (i == 10)
            {
                System.out.printf("%8d", 100);
            }

            else
            {
                System.out.printf("%02d - %02d", (i * 10), (i * 10 + 9));
            }

            for (int j = 0; j < starCounts[i]; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }    
}
