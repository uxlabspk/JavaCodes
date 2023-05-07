

import java.awt.Point;

public class Ref 
{
    public static void main(String[] args) 
    {
        Point p1 = new Point(3, 4);
        Point p2 = p1;

        p1.x = 34;

        System.out.println(p1);
        System.out.println(p2);
    }    
}
