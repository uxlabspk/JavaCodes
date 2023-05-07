



class MyClass 
{
    protected int var;

    MyClass()
    {
        var = 8;
    }
}

class SubClass extends MyClass
{
    SubClass()
    {
        var += 12;
    }

}

public class protectedExample 
{
    public static void main(String[] args) 
    {    
        MyClass m = new SubClass();

        System.out.println(m.var);
    }
}