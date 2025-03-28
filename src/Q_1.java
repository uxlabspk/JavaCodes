package src;
// Muhammad Naveed

// (Largest and Smallest Integers) Write an application that reads five integers
// and determines and prints the largest and smallest integers in the group.

public class Q_1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 9, 1, 0, -5};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            largest = (numbers[i] > largest) ? numbers[i] : largest;
            smallest = (numbers[i] < smallest) ? numbers[i] : smallest;
        }

        System.out.println(largest);

        System.out.println(smallest);

    }
}
