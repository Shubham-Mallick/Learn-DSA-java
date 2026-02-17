import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet <Integer> set = new HashSet<>();

        // Adding elements 
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);   // Duplicate (will not be added)

        System.out.println(set); // Print all element 

        // Delete 
        set.remove(1);

        System.out.println(set);

        //Search
        if (set.contains(4)) System.out.println("4 is present in Set");

        // Size
        set.add(10);

        System.out.println("Size of Set is " + set.size());

        //Iterator 
        Iterator it = set.iterator();
        // next() :- return the next element and moves the iterator forward by one position.
        // hasnext() :- check if there is another element available in the collection (return true/false)

        while(it.hasNext()){
            System.out.print(it.next() + "\t");
        }

    }
}
