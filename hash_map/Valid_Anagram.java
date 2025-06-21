package hash_map;

import java.util.HashMap;

public class Valid_Anagram {

    public boolean isBoolean(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (mp.get(ch) != null) {
                if (mp.get(ch) == 1) { // if freuency is one remove it
                    mp.remove(ch);
                } else {
                    mp.put(ch, mp.get(ch) - 1); // here fre is decrese bcz it
                }
            } else {
                return false;
            }
        }
        return mp.isEmpty();

    }

    public static void main(String[] args) {
        String s = "hellow";
        String t = "ewlloh";
    }

}
