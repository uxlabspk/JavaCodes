



// 5/0 ; 5/1; 5/2 .... 5/9



public class tryCatch 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++) 
        {
            try 
            {

                // if (i == 0)    throw new ArithmeticException();
                // else    System.out.println("5 / " + i + " is => " + (double) 5/i);

                if (i == 0)
                {
                    throw new ArithmeticException();
                }
                else 
                {
                    System.out.println("5 / " + i + " is => " + (double) 5/i);
                }
            } 
            catch (ArithmeticException e) 
            {
                e.printStackTrace();
                i++;
            }
        }
    }
}


