




public class Elvis 
{
    public static int checkMax(int first, int second)
    {
        int maxNumber = (first > second) ? first : second;
        
        return maxNumber;
    }
    public static void main(String[] args) 
    {   
        System.out.println(checkMax(23, 43));
    }    
}
