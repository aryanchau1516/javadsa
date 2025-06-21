package hash_map;

import java.util.HashMap;

/*
 * key and value pair
 * frequencymap means how many time a object ccour
 * why use it -> searching ,insertin,deletion,lkup,contains in cnstant
 * time cmplexity 0(1) tc
 * Hashmap does not allow duplicate key but it allow duplicate value with unique key 
 */
public class One_1 {
    public static void main(String[] args) {
        // syntax
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a1", 1); // use for entry
        mp.put("a2", 2);
        mp.put("a3", 3);
        mp.put("a4", 6);
        System.out.println(mp.containsKey("a1"));
        // System.out.println(mp.get("er")); null utput
        // for(String key : mp.keySet()){

        // System.out.printf("the age of %s id %d \n", key,mp.get(key));
        // }
    }

}
