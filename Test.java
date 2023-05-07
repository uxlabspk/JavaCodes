



public class Test 
{
    // Static method adding two int numbers.
    public static int add(int first, int second)
    {
        return (first + second);
    }

    // Overloaded static method adding two double type numbers.
    public static double add(double first, double second)
    {
        return (first + second);
    }

    // Overloaded static method concatinating two Strings.
    public static String add(String first, String second)
    {
        return (first + second);
    }

    // main driven function.
    public static void main(String[] args) 
    {
        System.out.println(add(32, 32));
        System.out.println(add(3.2, 32.78));
        System.out.println(add("Muhammad ", "Naveed"));
    }
}
