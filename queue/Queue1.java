package queue;
import java.util.*;
public class Queue1 {
public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();  // queue not use because its a interface and we can't make its object
    //or
    //  Queue<Integer> q = new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(5);
   // System.out.println(q);
   while (!q.isEmpty()) {
    System.out.println(q.peek());
    q.remove();
   }
}
    
}
