


public class StringsMethods 
{
    public static void main(String[] args) 
    {
        // Declaring the String
        String myName = "Muhammad Naveed";

        // Check whether myName starts with the char 'M'
        boolean isTrue = myName.startsWith("M");
        System.out.println(isTrue);

        // Check whether myName ends with the char 'd'
        isTrue = myName.endsWith("d");
        System.out.println(isTrue);

        // Return count of chars in myName
        System.out.println(myName.length());

        // Return the index of first occurance of char 'a' 
        System.out.println(myName.indexOf("a"));
        
        // Replace all occurance of 'e' with '*'
        System.out.println(myName.replace("e", "*")); 
        System.out.println(myName);

        // Transform myName to lowercase letters
        System.out.println(myName.toLowerCase());

        // Transform myName to uppercase letters
        System.out.println(myName.toLowerCase());

        // Remove the unecessary spaces from the string.
        System.out.println(myName.trim());
    }   
}