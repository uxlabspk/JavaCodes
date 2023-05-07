

import java.util.Arrays;

public class arrays 
{
    public static void main(String[] args) 
    {
        int[] number = new int[5];

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        System.out.println(Arrays.toString(number));
    
        for (int i : number) 
        {
            System.out.println(i);
        }
    }
}