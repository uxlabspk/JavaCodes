package src;


import java.util.ArrayList;

public class arrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> myIntList = new ArrayList<>(3);

        // Adding the elements of src.array list
        myIntList.add(3);
        myIntList.add(2);
        myIntList.add(89);
        myIntList.add(19);
        myIntList.add(92);

        // Check whether 32 is in arraylist
        System.out.println(myIntList.contains(32));

        // Return value at given index
        System.out.println(myIntList.get(1));
        
        // For each loop on arraylist using method reference
        myIntList.forEach(System.out::println);

        // Return boolean whether the list is empty or not.
        System.out.println(myIntList.isEmpty());

        // Return the size of src.array list
        System.out.println(myIntList.size());

        // Convert to string Object.
        System.out.println(myIntList.toString());

        // Clear the src.array list
        myIntList.clear();
    }    
}
