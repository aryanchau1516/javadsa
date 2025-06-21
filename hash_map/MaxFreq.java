package hash_map;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap();
        int[] arr = { 1, 2, 3, 4, 1, 3, 24, 4, 5, 3, 4, 1, 3 };
        for (int num : arr) {
            if (!mp.containsKey(num)) {
                mp.put(num, 1);
            } else {
                mp.put(num, mp.get(num) + 1);
            }
        }
        System.out.println(mp.entrySet());
        int mxfreq = 0;
        int ansKey = -1;
        for (var e : mp.entrySet()) {
            if (e.getValue() > mxfreq) {
                mxfreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.printf("%d is occur   % time ", mxfreq, ansKey);
    }

}
