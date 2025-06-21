package hash_map;

import java.util.HashSet;
import java.util.Iterator;

// not allow duplicay in HashSet
public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        // System.out.println(hs);

        // iterate using iterate function
        Iterator t = hs.iterator(); // use for iterate and point to curren ele
        while (t.hasNext()) { // point to the next ele exist or not
            System.out.println(t.next()); // point to next ele exist

        }

        // or using forEach Loop
        for (Integer str : hs) {
            System.out.println(str);
        }
    }
}
