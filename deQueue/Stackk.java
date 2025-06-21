package deQueue;

import java.util.Deque;
import java.util.LinkedList;

/*
 * algrithm = stack using DEqueue
 * 1.push()--addLast)
 * 2.pop() --removeLast()
 * 3.peek()--getLAst()
 * 
 */
public class Stackk {
    Deque<Integer> dq = new LinkedList<>();
    public void push(int data){
            dq.addLast(data);
    }
    public int pop(){
        return dq.removeLast();
    }
    public int peek(){
        return dq.getLast();
    }
    public void dis(){
        while (!dq.isEmpty()) {
            System.out.print(dq.getLast()+" ");
            dq.removeLast();
        }
    }
    public static void main(String[] args) {
        Stackk obj = new Stackk();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
       // obj.dis();  //4 3 2 1
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        obj.dis();  //4 3 2 1  now the dq is empty
       
    }
    
}
