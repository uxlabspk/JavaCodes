


class CountAndPrint implements Runnable 
{

    private final String name;

    CountAndPrint(String name) 
    {
        this.name = name;
    }

    /** This is what a CountAndPrint will do */
    @Override
    public void run() 
    {
        for (int i = 0; i < 100; i++) 
        {
            System.out.println(this.name + ": " + i);
        }
    }

    public static void main(String[] args) 
    {
        // Launching 4 parallel threads
        for (int i = 1; i <= 4; i++) 
        {
            // `start` method will call the `run` method
            // of CountAndPrint in another thread
            new Thread(new CountAndPrint("Instance " + i)).start();
        }
        // Doing some others tasks in the main Thread
        for (int i = 0; i < 100; i++) 
        {
            System.out.println("Main: " + i);
        }
    }
}