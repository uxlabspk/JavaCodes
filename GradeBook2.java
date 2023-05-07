
import java.util.Scanner;

public class GradeBook2 
{
    private String courseName;
    
    // default constructor.
    public GradeBook2()
    {
        courseName = "";
    }

    // parametrized constructor.
    public GradeBook2(String courseName)
    {
        this.courseName = courseName;
    }

    // setter method.
    public void setCouseName(String courseName)
    {
        this.courseName = courseName;
    }

    // getter method.
    public String getCourseName()
    {
        return (this.courseName);
    }

    // display method.
    public void displayMessage()
    {
        System.out.println("Welcome to the grade book for " + getCourseName());
    }

    // average finder method.
    public void determineClassAverage()
    {
        var input = new Scanner(System.in);

        int total = 0;
        int grade = 0;
        int gradeCounter = 0;
        double average = 0.0;

        System.out.print("Enter grade or -1 to quit : ");
        grade = input.nextInt();

        while (grade != -1)
        {
            total += grade;
            gradeCounter++;

            System.out.print("Enter grade or -1 to quit : ");
            grade = input.nextInt();
        }

        input.close();

        if (gradeCounter != 0)
        {
            average = (double) total / gradeCounter;

            System.out.println("Total of " + gradeCounter + " grades are : " + total);
            System.out.printf("Average grades are : %.2f\n", average);
        }
        else
        {
            System.out.println("No grades were entered.");
        }
    }

    // main driven function
    public static void main(String[] args) 
    {
        var gradebook = new GradeBook2("CS 50");

        gradebook.displayMessage();
        gradebook.determineClassAverage();
    }
}
