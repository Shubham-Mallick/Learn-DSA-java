import java.util.*;


public class HashMapExample {
    public static void main(String[] args) {
        // Creating HashMap ---> Key(String) and Value(Integer)
        HashMap<String,Integer> map = new HashMap<>();

        // Insertion 
        map.put("India",130);
        map.put("China",150);
        map.put("USA",30);
        System.out.println(map);

        //Searching
        if(map.containsKey("India")){
            System.out.println("Key is present in the map!!");
        }else{
            System.out.println("Key is not present in the map!!");
        }

        //If we want the value of find key then
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        //Iteration in HashMap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
                   System.out.print(e.getKey() + " ");
       }

       System.out.println();

       // Remove 
       map.remove("USA");
       System.out.println(map);
    }
}
