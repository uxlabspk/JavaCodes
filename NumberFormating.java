import java.text.NumberFormat;

public class NumberFormating 
{
    public static void main(String[] args) 
    {
        // format 1024 in dollar format $1,024.00
        String currency = NumberFormat.getCurrencyInstance().format(1024);
        System.out.println(currency);
        
        // format 0.4 in percentage format 40%
        String percentage = NumberFormat.getPercentInstance().format(0.4);
        System.out.println(percentage);
    }    
}
