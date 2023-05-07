
import java.util.Scanner;

public class GradeBook 
{
    private String courseName;

    // Default constructor
    public GradeBook()
    {
        courseName = "";
    }

    // Parametrized constructor.
    public GradeBook(String courseName)
    {
        this.courseName = courseName;
    }

    // Setter method.
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    // Getter method.
    public String getCourseName() 
    {
        return (this.courseName);    
    }

    // Display method.
    public void displayMessage()
    {
        System.out.println("Welcome to grade book for " + getCourseName());
    }

    // Average finder method
    public void determineClassAverage()
    {
        var input = new Scanner(System.in);
        
        int total = 0;
        int grade = 0;
        int gradeCounter = 1;
        int average = 0;

        while (gradeCounter <= 10)
        {
            System.out.print("Enter grades : ");
            grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }

        input.close();

        average = (total / 10);

        System.out.println("The total of grades are : " + total);
        System.out.println("Class average is : " + average);
    }

    // Main driven function.
    public static void main(String[] args) 
    {
        var gradeBook = new GradeBook("CS50");
        
        gradeBook.displayMessage();
        gradeBook.determineClassAverage();
    }
}