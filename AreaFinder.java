

// Shape abstract class
abstract class Shape
{
    // abstract method. Remember: abstract method has no body.
    public abstract double area();
}

// Circle class inherited from shape class
class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    // See this annotation @Override, it is telling that this method is from parent
    // class Shape and is overridden here
    @Override
    public double area() 
    {
        return 3.14 * radius * radius; 
    }
}

// Rectangle class inherited from shape class
class Rectangle extends Shape
{
    private double length;
    private double width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // See this annotation @Override, it is telling that this method is from parent
    // class Shape and is overridden here
    @Override
    public double area() 
    {
        return length * width;
    }
}


public class AreaFinder 
{
    public static void main(String[] args) 
    {
        //This will create an object of circle class
        Shape circle = new Circle(5.0);
        //This will create an object of Rectangle class
        Shape rectangle = new Rectangle(5.4, 5.2);
        
        System.out.println("Shape of circle : " + circle.area());
        System.out.println("Shape of rectangle: " + rectangle.area());    
    }   
}

