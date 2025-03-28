package src;

public class GradeBook4 {
    private String courseName;
    private final int[] grades;
    private int total;

    // parametrized src.constructor.
    public GradeBook4(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // course name setter method.
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // course name getter method.
    public String getCourseName() {
        return courseName;
    }

    // display banner method.
    public void diplayMessage() {
        System.out.println("src.welcome to: " + getCourseName());
    }

    // average finder method.
    public double getAvg() {
        // enhanced for loop (also known as for-each loop)
        for (int grade : grades) {
            total = total + grade;
        }

        // returning average by explicit type casting.
        return (double) total / grades.length;
    }

    // minimum grade finder method.
    public int getMin() {
        int lowerGrade = grades[0];
        // enhanced for-loop
        for (int grade : grades) {
            if (grade < lowerGrade)
                lowerGrade = grade;
        }
        // returning lower grade.
        return lowerGrade;
    }

    // showing grades.
    public void processGrades() {
        OutputGrades();
        System.out.println("Class Average is : " + getAvg());
        System.out.println("Lowest Grade is : " + getMin());
    }

    // private method for showing grades.
    private void OutputGrades() {
        System.out.println("The grades are: ");
        for (int student = 0; student < grades.length; student++) {
            // showing in format "Student1   87"
            System.out.printf("Student%d%5d\n", (student + 1), grades[student]);
        }
    }

    // main driven function
    public static void main(String[] args) {
        // grades src.array
        int[] gradeArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        // creating object.
        var gb = new GradeBook4("CS-586 MPL", gradeArray);
        // calling displayMessage method.
        gb.diplayMessage();
        // calling processGrade method.
        gb.processGrades();
    }

}
