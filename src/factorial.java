package src;

// Muhammad Naveed 
// Factorial
// https://www.github.com/uxlabspk/JavaCodes/


public class factorial {
    private int number;
    private long factorial;

    // Default src.constructor.
    public factorial() {
        number = 0;
        factorial = 1;
    }

    // Setter method.
    public void setNumber(int number) {
        this.number = number;
    }

    // getter method.
    public int getNumber() {
        return number;
    }

    // src.factorial finder method
    public void findFactorial() {
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("The src.factorial of " + getNumber() + " is " + factorial);
    }

    // main method
    public static void main(String[] args) {
        var factorial = new factorial();

        factorial.setNumber(10);
        factorial.findFactorial();
    }

}
