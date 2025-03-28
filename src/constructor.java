package src;


public class constructor {
    private final String name;
    private final int age;

    // Default src.constructor
    public constructor() {
        name = "";
        age = 0;
    }

    // parametrized src.constructor
    public constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Show method
    public void showInfo() {
        System.out.println("My Name : " + name);
        System.out.println("My Age : " + age);
    }

    public static void main(String[] args) {
        // creating object
        var obj = new constructor("john", 12);
        // calling method
        obj.showInfo();
    }
}
