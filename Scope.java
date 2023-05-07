




public class Scope 
{
    // Global variable accessible in whole class.
    private int globalVariable = 34;

    public static void main(String[] args) 
    {
        var s = new Scope();
        
        // Local variable accessible in only main function not outside the main.
        int localVariable = 43;
        
        System.out.println("Global Variable : " + s.globalVariable);
        System.out.println("Local Variable : " + localVariable);
    }
}
