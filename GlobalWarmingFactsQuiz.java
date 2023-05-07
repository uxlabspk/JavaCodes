
// Muhammad Naveed
// 20 - Arid - 348
// https://www.github.com/uxlabspk/JavaCodes/


import java.util.Scanner;

// Quizz class.
public class GlobalWarmingFactsQuiz 
{
    private int userResults;        // user quizz results variable.
    private Scanner input;          // scanner class object.

    // default constructor.
    public GlobalWarmingFactsQuiz()
    {
        // Initializing variables.
        userResults = 0;                    
        input = new Scanner(System.in);
    }

    // Quizz method.
    public void startQuiz()
    {
        // Quizz question 1
        System.out.println("a. What is the greenhouse effect?");
        System.out.println("    1) Certain gases in the atmosphere trap heat and warm the Earth");
        System.out.println("    2) Certain gases in the atmosphere trap heat and warm the Earth");
        System.out.println("    3) The tilt of the Earth changes the amount of solar energy the Earth receives");
        System.out.println("    4) The Sun is putting out more radiant energy over time");
        System.out.print(">> ");
        
        int ans1 = input.nextInt();
        if (ans1 == 1) 
            userResults += 1;

        // Quizz question 2
        System.out.println("b.  Which activities are the largest contributors of greenhouse gases?");
        System.out.println("    1) Deforestation.");
        System.out.println("    2) Electricity generation.");
        System.out.println("    3) Industry.");
        System.out.println("    4) Transportation.");
        System.out.print(">> ");
        
        int ans2 = input.nextInt();
        if (ans2 == 2)
            userResults += 1;

        // Quizz question 3
        System.out.println("c. How has the global average temperature changed since the Industrial Revolution?");
        System.out.println("    1) Cooler by 0.1 degree C (0.2 degree F)");
        System.out.println("    2) The temperature has gone up and down, but remains overall the same.");
        System.out.println("    3) Warmer by 0.1 degree C (0.2 degree F)");
        System.out.println("    4) Warmer by more than 1 degree C (2.1 degrees F)");
        System.out.print(">> ");
        
        int ans3 = input.nextInt();
        if (ans3 == 4)
            userResults += 1;
        
        // Quizz question 4
        System.out.println("d. When was the last time in Earth's history that CO2 was as high as it is now?");
        System.out.println("    1) This is the highest it's ever been.");
        System.out.println("    2) CO2 was at least this high during the warm periods between the ice ages.");
        System.out.println("    3) CO2 has not been this high for almost one million years.");
        System.out.println("    4) The last time CO2 was this high was 3 million years ago.");
        System.out.print(">> ");
        
        int ans4 = input.nextInt();
        if (ans4 == 4)
            userResults += 1;
        
        
        // Quizz question 5
        System.out.println("e.  How long does CO2 remain in the atmosphere?");
        System.out.println("    1) CO2 washes out of the atmosphere seasonally.");
        System.out.println("    2) CO2 remains in the atmosphere for 5-10 years.");
        System.out.println("    3) CO2 remains in the atmosphere for up to 200 years, or more.");
        System.out.println("    4) CO2 remains in the atmosphere for up to 10 years.");
        System.out.print(">> ");
        
        int ans5 = input.nextInt();
        if (ans5 == 3) 
            userResults += 1;
        

        // closing the scanner class object 
        input.close();
    }

    // results showing method.
    public void showResults()
    {
        // printing the user score.
        System.out.printf("\nScore: %d/5\n", userResults);
        
        if (userResults == 5)
            System.out.println("Excellent!");
        else if (userResults == 4)
            System.out.println("Very Good!");
        else 
            System.out.println("Time to brush up your knowledge of global warming!");
    }

    // main driven function
    public static void main(String[] args) 
    {
        // creating object of GlobalWarmingFactsQuiz class.
        var GWF_Obj = new GlobalWarmingFactsQuiz();

        // calling method to start quizz.
        GWF_Obj.startQuiz();
        // calling method to show the quizz results.
        GWF_Obj.showResults();
    }   
}