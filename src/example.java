package src;

import java.util.Random;

public class example {
    public static void main(String[] args) {
        var randomNumber = new Random();

        int face = 0;

        for (int i = 01; i <= 20; i++) {
            if (i % 5 == 1) {
                System.out.print("[ ");
            }

            face = (1 + randomNumber.nextInt(6));
            System.out.print(face + " ");

            if (i % 5 == 0) {
                System.out.println("]");
            }
        }
    }
}