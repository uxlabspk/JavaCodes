
import java.util.Scanner;;

public class GradeBook3 
{
    private String courseName;
    private int total;
    private int gradeCounter;
    private int aCount;    
    private int bCount;    
    private int cCount;    
    private int dCount;    
    private int fCount;    

    // default constructor.
    public GradeBook3()
    {
        courseName = "";
        total = gradeCounter = aCount = bCount = cCount = dCount = fCount = 0;
    }

    // parametrized constructor.
    public GradeBook3(String courseName)
    {
        this.courseName = courseName;
    }

    // setter method.
    public void setCourseName(String courseName)
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
        System.out.println("Welcome to grade book for " + getCourseName());
    }

    // input user entered grades .
    public void inputGrades()
    {
        var input = new Scanner(System.in);

        int grades = 0;

        System.out.print("Enter grades (0 - 100) : ");
        while (input.hasNext())
        {
            grades = input.nextInt();
            total += grades;
            ++gradeCounter;

            incrementLetterGradeCounter(grades);
        }
        input.close();
    }

    // increment in grade counter vairables
    private void incrementLetterGradeCounter(int grade)
    {
        switch (grade / 10)
        {
            case 10:
            case 9:
                ++aCount;
                break;
            
            case 8:
                ++bCount;
                break;

            case 7:
                ++cCount;
                break;

            case 6: 
                ++dCount;
                break;

            default:
                ++fCount;
                break;
        }
    }

    // display the grade reports.
    public void displayGradeReport()
    {
        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;
            System.out.println("Total of " + gradeCounter + " grades : " + total);
            System.out.printf("Average of grades is %.2f\n", average);
            System.out.println("Number of students who received each grade: \n" + 
            "A : " + aCount + "\n" + 
            "B : " + bCount + "\n" + 
            "C : " + cCount + "\n" + 
            "D : " + dCount + "\n" + 
            "F : " + fCount + "\n");
        }
        else 
        {
            System.out.println("No grades were entered.");
        }
    }

    // main driven function.
    public static void main(String[] args) 
    {
        var gradebook = new GradeBook3("CS 50");

        gradebook.displayMessage();
        gradebook.inputGrades();
        gradebook.displayGradeReport();
    }
}
