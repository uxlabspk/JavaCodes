package src;
// Muhammad Naveed.
// Finding the square root using newton raphson method.


import java.util.Scanner;

public class NewtonRaphson {
    private int number;
    private final float[] root;
    private final int initialGuess;

    // Default src.constructor for initialising src.variables.
    public NewtonRaphson() {
        initialGuess = 1;
        number = 0;
        root = new float[100];
    }

    // setter method
    public void setNumber(int number) {
        this.number = number;
    }

    // square root finder method
    public void calculateRoot() {
        root[0] = initialGuess;
        for (int i = 0; i < root.length; i++) {
            // newton raphson algorithm.
            root[i + 1] = (float) (0.5) * (root[i] + (number / root[i]));

            if (root[i] == root[i + 1]) {
                showResults(root[i], i);
                break;
            } else {
                continue;
            }
        }
    }

    // Result showing constant method.
    public final void showResults(float result, int i) {
        System.out.println("The square root of " + number + " is " + result + " and found in " + i + "th iteration.");
    }

    public static void main(String[] args) {
        var NewtonRaphson_obj = new NewtonRaphson();
        var s = new Scanner(System.in);

        System.out.print("Enter the number : ");
        NewtonRaphson_obj.setNumber(s.nextInt());
        s.close();
        NewtonRaphson_obj.calculateRoot();
    }
}
