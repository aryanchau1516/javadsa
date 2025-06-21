package deQueue;

import java.util.Deque;
import java.util.LinkedList;

/*
 * algrithm = stack using DEqueue
 * 1.add()--addLAst)
 * 2.remove() --removeFirst()
 * 3.peek()--getFirst()     bcz que peek ele is first ele
 * 
 */
public class Queuee {
 Deque<Integer> dq = new LinkedList<>();
    public void add(int data){
            dq.addLast(data);
    }
    public int remove(){
        return dq.removeFirst();
    }
    public int peek(){
        return dq.getFirst();
    }
    public void dis(){
        while (!dq.isEmpty()) {
            System.out.print(dq.getFirst()+" ");
            dq.removeFirst();
        }
    }
    public static void main(String[] args) {
        Queuee obj = new Queuee();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
       // obj.dis();  // 1 2 3 4 
        System.out.println(obj.peek()); //1
        System.out.println(obj.remove()); //1
        obj.dis();  //2 3 4 
    }
    
}
