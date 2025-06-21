package hash_map;

import java.util.HashSet;

public class DistinctEle {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = { 4, 3, 2, 5, 6, 7, 4, 2, 1 };

        for (int i : arr) {
            hs.add(i);

        }
        System.out.println(hs);
        System.out.println(hs.size());
    }

}
