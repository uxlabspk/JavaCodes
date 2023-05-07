


public class Main 
{
    // username variale.
    private String userName;

    // Default contructor.
    Main()
    {
        userName = "";
    }    

    // Overloaded constructor.
    Main(String userName)
    {
        this.userName = userName;
    }

    // accessor or getter method.
    public String getUserName()
    {
        return this.userName;
    }

    // mutator or setter method.
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    // main drivan function.
    public static void main(String[] args) 
    {
        // creating first user.
        var user1 = new Main();
        user1.setUserName("Muhammad Naveed");
        System.out.println(user1.getUserName());

        // creating second user.
        var user2 = new Main("M Naveed");
        System.out.println(user2.getUserName());
    }
}
