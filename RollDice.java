

import java.util.Random;

public class RollDice 
{
    public static void main(String[] args) 
    {
        var randomNumber = new Random();

        int frequency_1 = 0;
        int frequency_2 = 0;
        int frequency_3 = 0;
        int frequency_4 = 0;
        int frequency_5 = 0;
        int frequency_6 = 0;

        int face = 0;

        for (int i = 1; i <= 6_000_000; i++)
        {
            // random number in between (1 - 6)
            face = (1 + randomNumber.nextInt(6));

            switch (face)
            {
                case 1: 
                    ++frequency_1;
                    break;
                
                case 2:
                    ++frequency_2;
                    break;

                case 3: 
                    ++frequency_3;
                    break;

                case 4:
                    ++frequency_4;
                    break;

                case 5:
                    ++frequency_5;
                    break;

                case 6:
                    ++frequency_6;
                    break;
            }
        }

        System.out.println("Face\tFrequency");
        System.out.println("1\t" + frequency_1);        
        System.out.println("2\t" + frequency_2);        
        System.out.println("3\t" + frequency_3);        
        System.out.println("4\t" + frequency_4);        
        System.out.println("5\t" + frequency_5);        
        System.out.println("6\t" + frequency_6);        
    }    
}
