


public class MaxFinder 
{
    // Static maximum finder method.
    public static double maximum(double x, double y, double z)    
    {
        double maxValue = x;

        maxValue = (y > maxValue) ? (y) : (maxValue);
        maxValue = (z > maxValue) ? (z) : (maxValue);

        return maxValue;
    }

    public static void main(String[] args) 
    {
        double firstNumber = 4.5;
        double secondNumber = 4.8;
        double thirdNumber = 9.0;
        double results = 0.0;

        // Calling static maximum method.
        results = maximum(firstNumber, secondNumber, thirdNumber);

        // printing the results.
        System.out.println("The maximum number is : " + results);
    }
}
