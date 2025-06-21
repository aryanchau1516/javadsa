package queue;
import java.util.*;


public class Reverse {
    static void rev(Queue<Integer> q){
        Stack<Integer> st = new  Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
            
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
            
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new  LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        rev(q1);
      //  System.out.println(q1); //[5, 4, 3, 2, 1]
      while (!q1.isEmpty()) {
        System.out.print(q1.remove()+" ");  //5 4 3 2 1
       // q1.remove();
      }
    }
}
