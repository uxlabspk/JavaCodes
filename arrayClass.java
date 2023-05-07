
public class arrayClass {

    private int[] items;
    private int count = 0;

    public arrayClass(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count++] = item;
    }

    public int indexOf(int item) {
        for(int i = 0; i < count; i++)
        {
            if (items[i] == item)
                return i;
        }

        return -1;
    }

    public void removeAt(int index) {
        if(index < 0 || index >=count)
        {
            throw new IllegalArgumentException();
        }
        for(int i = index; i < count; i++)
        {
            items[i] = items[i+1];
            count--;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);

    }

    public static void main(String[] args) {
        arrayClass array = new arrayClass(3);
        array.insert(10); //0
        array.insert(20); //1
        array.insert(30); //2
        array.insert(40); //3
        array.insert(50); //4
        array.removeAt(4);

        System.out.println(array.indexOf(50));

        array.print();
    }
}
