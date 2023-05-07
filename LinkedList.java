

// LinkedList.java

class Node 
{
    private int val;
    private Node next;

    Node()
    {
        val = 0;
    }

    Node(int val)
    {
        this.val = val;
        next = new Node();
    }

    public int getVal()
    {
        return val;
    }

    public Node getNextNode()
    {
        return next;
    }

    public void setNextNode(Node next)
    {
        this.next = next;
    }
}

public class LinkedList 
{
    private Node head;
    private Node tail;

    LinkedList()
    {
        head = tail = null;
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    public void addLast(int item)
    {
        var node = new Node(item);

        if (isEmpty())
        {
            head = tail = node;
        }

        else 
        {
            tail.setNextNode(node);
            tail = node;
        }
    }

    public void addFirst(int item)
    {
        var node = new Node(item);

        if (isEmpty())
        {
            head = tail = node;
        }

        else 
        {
            node.setNextNode(head);
            head = node;
        }
    }

    public void removeFirst()
    {
        if (isEmpty())
        {
            System.out.println("Linked list is empty...");
        }

        else if (head == tail)
        {
            return;
        }

        else 
        {
            var secondNode = head.getNextNode();
            head.setNextNode(null);
            head = secondNode;
        }
    }

    public void removeLast()
    {
        Node currentNode = head;

        while (currentNode != null)
        {
            if (currentNode.getNextNode() == tail)
            {
                break;
            }
            currentNode = currentNode.getNextNode();
        }

        tail = currentNode;
        tail.setNextNode(null);
    }

    public int indexOf(int item)
    {
        int index = 0;
        Node currentNode = head;

        while (currentNode != null)
        {
            if (currentNode.getVal() == item)
            {
                return index;
            }
            currentNode = currentNode.getNextNode();
            index++;
        }

        return -1;
    }

    public boolean contains(int item)
    {
        return (indexOf(item) != -1);
    }

    public static void main(String[] args) 
    {
        var linkedlist = new LinkedList();  // list items [55, 54, 34, 90] 
        
        linkedlist.addFirst(34);      //  0  1  2  = 2nd index
        linkedlist.addFirst(54);      //  0  1     = 1st index
        linkedlist.addFirst(55);      //  0        = 0th index
        linkedlist.addLast(90);       //  3        = 3rd index

        System.out.println(linkedlist.indexOf(34));
        System.out.println(linkedlist.indexOf(54));
        System.out.println(linkedlist.indexOf(55));
        System.out.println(linkedlist.indexOf(90));

        System.out.println(linkedlist.contains(59));
        System.out.println(linkedlist.contains(90));
    }

}
