package src;


public class Enumerations {
    enum D {
        EAST, WEST, NORTH, SOUTH
    }

    public static void main(String[] args) {
        System.out.println(D.valueOf("0"));
    }
}
