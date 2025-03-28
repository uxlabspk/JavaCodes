package src;// Muhammad Naveed.
// Heart Rate calculator.
// Assignment no. 01

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

// heart rate src.clas
class HeartRates {
    // private fields for holding user data.
    private String firstName;
    private String lastName;
    private LocalDate dob;

    // Default src.constructor for initializing private fields.
    public HeartRates() {
        firstName = lastName = "";
        dob = LocalDate.of(2023, 3, 20);
    }

    // Parametrized src.constructor.
    public HeartRates(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    // First name setter method.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last name setter method.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Date of birth setter method.
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Overloaded Date of birth setter method.
    public void setDob() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year : ");
        int year = sc.nextInt();
        System.out.print("Enter your birth month : ");
        int month = sc.nextInt();
        System.out.print("Enter your birth day : ");
        int day = sc.nextInt();

        sc.close();

        LocalDate birth = LocalDate.of(year, month, day);

        dob = birth;
    }

    // First name getter method.
    public String getFirstName() {
        return firstName;
    }

    // Last name getter method.
    public String getLastName() {
        return lastName;
    }

    // Date of birth getter method.
    public LocalDate getDob() {
        return dob;
    }

    // Calculate age in years method.
    public int calculateAge() {
        LocalDate nowDate = LocalDate.now();
        Period dateDifference = Period.between(dob, nowDate);
        int ageInYear = dateDifference.getYears();

        return ageInYear;
    }

    // maximum heart rate finder method.
    public int maximumHeartRate() {
        return (220 - calculateAge());
    }

    // calculate target heart rate at 50%
    public int targetHeartRate1() {
        return (int) (maximumHeartRate() * 0.50);
    }

    // calculate target heart rate at 85%
    public int targetHeartRate2() {
        return (int) (maximumHeartRate() * 0.85);
    }
}

// heart rate src.test class.
public class HeartRatesTest {
    // main driving method.
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        LocalDate myBirth = LocalDate.of(2002, 06, 24);

        // creating src.first object.
        var hr_obj1 = new HeartRates("Muhammad", "Naveed", myBirth);
        // creating second object.
        var hr_obj2 = new HeartRates();

        // prompting information from user.
        System.out.print("Enter your src.first name : ");
        hr_obj2.setFirstName(sc.nextLine());

        System.out.print("Enter your last name : ");
        hr_obj2.setLastName(sc.nextLine());

        hr_obj2.setDob();
        sc.close();

        // Printing information for src.first object.
        System.out.println("");
        System.out.println("Printing Object 1 Information.");
        System.out.println("------------------------------");
        System.out.println("First Name : " + hr_obj1.getFirstName());
        System.out.println("Last Name : " + hr_obj1.getLastName());
        System.out.println("Date of birth : " + hr_obj1.getDob());
        System.out.println("Age in years : " + hr_obj1.calculateAge());
        System.out.println("Maximum heart rate " + hr_obj1.maximumHeartRate() + " per minute.");
        System.out.println("Target heart rate lies in between " + hr_obj1.targetHeartRate1() + " to " + hr_obj1.targetHeartRate2() + " beats per minute.");
        System.out.println("");

        // Printing information for second object.
        System.out.println("");
        System.out.println("Printing Object 2 Information.");
        System.out.println("------------------------------");
        System.out.println("First Name : " + hr_obj2.getFirstName());
        System.out.println("Last Name : " + hr_obj2.getLastName());
        System.out.println("Date of birth : " + hr_obj2.getDob());
        System.out.println("Age in years : " + hr_obj2.calculateAge());
        System.out.println("Maximum heart rate " + hr_obj2.maximumHeartRate() + " per minute.");
        System.out.println("Target heart rate lies in between " + hr_obj2.targetHeartRate1() + " to " + hr_obj2.targetHeartRate2() + " beats per minute.");
    }
}
