package queue;

import java.util.*;

public class FirstNonRepeat {
    public static void nonRepeating(String str){
        int freq[] = new int[26];
        Queue <Character> q = new LinkedList<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty()&&freq[q.peek()-'a']>1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
       // System.out.print();
    }
    public static void main(String[] args) {
        nonRepeating("aabccxb");
        
    }
}
