

class Animal 
{
	private int legs;
	private String color;
	private boolean vegitarian;

	Animal() 
	{
		legs = 0;
		color = "";
		vegitarian = false;
	}

	Animal(int legs, String color, boolean vegitarian) 
	{
		this.legs = legs;
		this.color = color;
		this.vegitarian = vegitarian;
	}

	public int getLegs() 
	{
		return legs;
	}

	public void setLegs(int legs) 
	{
		this.legs = legs;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public boolean isVegitarian() 
	{
		return vegitarian;
	}

	public void setVegitarian(boolean vegitarian) 
	{
		this.vegitarian = vegitarian;
	}
}

class Cat extends Animal 
{
	Cat(int legs, String color, boolean vegitarian) 
	{
		super(legs, color, vegitarian);
	}
}

class Dog extends Animal 
{
	Dog(int legs, String color, boolean vegitarian) 
	{
		super(legs, color, vegitarian);
	}
}

public class InheritanceExample 
{
	public static void main(String[] args) 
	{
		var kattie = new Cat(4, "White", false);

		System.out.println("Cat has " + kattie.getLegs() + " legs");
		System.out.println("Cat color is " + kattie.getColor());
		System.out.println("Is cat a vegitarian? " + kattie.isVegitarian());

		// Cat c = new Cat(4, "Black", false);
		// Dog d = new Dog(4, "White", false);

		// Animal a = c;

		// boolean flag = c instanceof Cat; // normal case, returns true
		// System.out.println(flag);
		// flag = c instanceof Animal; // returns true since c is-an Animal too
		// System.out.println(flag);
		// flag = a instanceof Cat; // returns true because a is of type Cat at runtime
		// System.out.println(flag);
		// flag = a instanceof Dog; // returns false for obvious reasons.
		// System.out.println(flag);

	}
}
