package hash_map;

import java.util.HashMap;
import java.util.Set;

// Set = > set is an unOrders data Structure which retrive all data in um=unOrder manner

public class Base_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("India", 1);
        mp.put("pak", 0);
        mp.put("eng", 2);
        mp.put("usa", 3);
        mp.put("uae", 4);
        System.out.println(mp);
        Integer a = mp.get("uae");
        System.out.println(a);
        boolean b = mp.containsKey("pak");
        System.out.println(b);
        System.out.println(mp.size());

        // creating a set

        Set<String> keys = mp.keySet(); // creatng a set intialize with keySet() method which stores key values
        System.out.println(keys);
        for (String n : keys) {
            System.out.println("key = " + n + " , " + "vlues = " + mp.get(n));
        }
    }

}
