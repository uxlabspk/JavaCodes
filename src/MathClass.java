package src;


public class MathClass {
    public static void main(String[] args) {
        double someValue = 34.23;

        // round the number => 34
        System.out.println(Math.round(someValue));
        // ceil the number => 35.0
        System.out.println(Math.ceil(someValue));
        // floor the number => 34.0
        System.out.println(Math.floor(someValue));
        // find maximum number
        System.out.println(Math.max(42, 66));
        // find minimum number
        System.out.println(Math.min(42, 66));
        // generate random number between (0 - 1)
        System.out.println(Math.random());
    }
}
