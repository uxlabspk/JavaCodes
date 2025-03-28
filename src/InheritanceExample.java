package src;

class AnimalClass {
    private int legs;
    private String color;
    private boolean vegitarian;

    AnimalClass() {
        legs = 0;
        color = "";
        vegitarian = false;
    }

    AnimalClass(int legs, String color, boolean vegitarian) {
        this.legs = legs;
        this.color = color;
        this.vegitarian = vegitarian;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVegetarian() {
        return vegitarian;
    }

    public void setVegitarian(boolean vegetarian) {
        this.vegitarian = vegetarian;
    }
}

class Cat extends AnimalClass {
    Cat(int legs, String color, boolean vegetarian) {
        super(legs, color, vegetarian);
    }
}

class Dog extends AnimalClass {
    Dog(int legs, String color, boolean vegetarian) {
        super(legs, color, vegetarian);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        var kattie = new Cat(4, "White", false);

        System.out.println("src.Cat has " + kattie.getLegs() + " legs");
        System.out.println("src.Cat color is " + kattie.getColor());
        System.out.println("Is cat a vegetarian? " + kattie.isVegetarian());

        // src.Cat c = new src.Cat(4, "Black", false);
        // src.Dog d = new src.Dog(4, "White", false);

        // src.Animal a = c;

        // boolean flag = c instanceof src.Cat; // normal case, returns true
        // System.out.println(flag);
        // flag = c instanceof src.Animal; // returns true since c is-an src.Animal too
        // System.out.println(flag);
        // flag = a instanceof src.Cat; // returns true because a is of type src.Cat at runtime
        // System.out.println(flag);
        // flag = a instanceof src.Dog; // returns false for obvious reasons.
        // System.out.println(flag);

    }
}
