

public class Player
{
    private String userName;
    private float userHeight;
    private int userLife;
    private boolean hasWin;

    // Default Constructor.
    Player() 
    {
        userLife = 0;
        userHeight = 0.0F;
        userName = "";
        hasWin = true;
    }

    // Parametrized Constructor.
    Player(String userName, float userHeight)
    {
        this.userName = userName;
        this.userHeight = userHeight;
    }

    // Overloaded Parametrized Constructor.
    Player(String userName, float userHeight, int userLife)
    {
        // Calling the above constructor using this keyword.
        this(userName, userHeight);
        this.userLife = userLife;
    }

    // Accessor or getter method.
    public int getLife()
    {
        return this.userLife;
    }

    // Accessor or getter method.
    public boolean userStatus()
    {
        return this.hasWin;
    }

    // Gain Health.
    public void addHealth()
    {
        if (userLife < 3)
            userLife++;
    }

    // Loss Health.
    public void loseHealth()
    {
        if (userLife < 3)
            userLife--;
        else
            hasWin = false;
    }

    // Showing Game Results.
    public void showSummary()
    {
        System.out.println("Username : " + this.userName);
        System.out.println("Height   : " + this.userHeight + "cm");
        System.out.println("Life     : " + this.userLife);
        System.out.println("Win      : " + this.userStatus());
    }

    // Main driven function.
    public static void main(String[] args) 
    {
        var p = new Player("Naveed", 1.71F, 3);

        p.showSummary();
    }
}