package src;


public class MethodOverloading {
    // method adding two int numbers.
    public int add(int first, int second) {
        return (first + second);
    }

    // Overloaded method adding two double type numbers.
    public double add(double first, double second) {
        return (first + second);
    }

    // Overloaded method concatenating two Strings.
    public String add(String first, String second) {
        return (first + second);
    }

    // main driven function.
    public static void main(String[] args) {
        var obj = new MethodOverloading();

        System.out.println(obj.add(32, 32));    // 64
        System.out.println(obj.add(3.2, 3.78)); // 6.98
        System.out.println(obj.add("Muhammad ", "Naveed")); //Muhammad Naveed
    }
}


