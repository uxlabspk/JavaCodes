

/*
 * Write a java app for the following output. the second line
 * in the output "CS101 Introduction to Java Programming!" is
 * passed from the constructor. take two dimension array to
 * print the student numbers and their respective grades. Write
 * functions for calculating average marks, displaying the
 * lowest and highest grades. Use inheritance if necessary.
 */


// Grade Book Class.
public class GradeBook
{
    // Title of the grade book.
    private final String title;

    // array for holding students grades.
    private int[][] studentsGrades;

    // array for holding average of grades.
    private final double[] average = new double[10];

    // parametrized constructor.
    public GradeBook(String title)
    {
        this.title = title;
    }

    // method for getting grades input.
    private void getGrades()
    {
        /* here I am hardcoded the array. if you want to get input from user you may use loop like this:
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 10; i++)
        // {
        //      for (int j = 0; j < 3; j++)
        //      {
        //          studentsGrades[i][j] = sc.nextInt();
        //      }
         } */

        studentsGrades = new int[][]
        {
                {87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}
        };
    }

    // method for calculating the average of mark of student.
    private void calculateAverage()
    {
        for (int i = 0; i < studentsGrades.length; i++)
        {
            double avg = 0.0;
            for (int j = 0; j < 3; j++)
            {
                avg += studentsGrades[i][j];
            }
            avg /= 3;
            average[i] = avg;
        }
    }

    // Printing the grades on console.
    public void printGrades()
    {
        System.out.println("Welcome to the grade book for");
        System.out.println(title);

        System.out.println("\nThe grades are : ");

        System.out.printf("%20s %10s %10s %10s \n", "Test1", "Test2", "Test3", "Average");
        for (int i = 0; i < studentsGrades.length; i++)
        {
            System.out.printf("Student %02d", (i + 1));
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%10s", studentsGrades[i][j]);
            }
            // precise up-to 2 decimal point
            System.out.printf("%12.2f \n", average[i]);
        }
    }

    public static void main(String[] args)
    {
        // Creating the grade book object.
        GradeBook gradeBook = new GradeBook("CS101 Introduction to Java Programming!");

        // calling required methods.
        gradeBook.getGrades();
        gradeBook.calculateAverage();
        gradeBook.printGrades();
    }
}