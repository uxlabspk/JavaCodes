


public class objects 
{
    private String myName;

    public objects()
    {
        myName = "";
    }

    public objects(String name)
    {
        myName = name;
    }

    // setter method.
    public void setName(String name)
    {
        myName = name;
    }

    // getter method.
    public String getName()
    {
        return myName;
    }

    public static void main(String[] args) 
    {
        // Creating object of objects class.
        var obj = new objects();
        // calling setter method.
        obj.setName("naveed");
        // calling getter method. 
        System.out.println(obj.getName());
    }
    
}
