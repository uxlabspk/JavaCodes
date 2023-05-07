

// Muhammad Naveed 
// Integer Stack
// https://www.github.com/uxlabspk/JavaCodes/


public class Stack 
{
    private int[] stackArray;
    private int top;

    Stack()
    {
        stackArray = new int[10];
        top = -1;
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public void push(int value)
    {
        stackArray[++top] = value;
    }

    public int pop()
    {
        int popElement = stackArray[top];

        if (isEmpty())
        {
            System.out.println("Stack is Empty.");
            return 0;
        }
        
        else
        {
            stackArray[top--] = 0;
        }

        return popElement;
    }

    // Show is not the method of stack but, here we are just printing our stack.
    public void show()
    {
        for (int index = 0; index <= top; index++)
        {
            System.out.println(stackArray[index]);
        }
    }

    public static void main(String[] args) 
    {
        var stack = new Stack();
        
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.show();
    }
}
