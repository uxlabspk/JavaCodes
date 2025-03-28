package src;


public class Break {
    public static void main(String[] args) {
        int userValue = 11;

        // Iteration for 100 times.
        for (int index = 0; index < 100; index++) {
            // if index == userValue (11) then, break the loop.
            if (index == userValue) {
                break;
            }
            // printing the index.
            System.out.println(index);
        }
    }
}
