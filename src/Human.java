package src;

public class Human {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        var h = new Human();

        h.setName("Naveed");

        System.out.println(h.getName());
    }
}
