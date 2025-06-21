package queue;
// queue using two stack

import java.util.Stack;

public class UingStak {
    /**
     * InnerUingStak
     */
   static class InnerUingStak {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public  boolean isEmpty() {
            return s1.isEmpty();
        }

        public  void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());

            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());

            }
        }

        public  int remove() {
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;

            }
            return s1.pop();
        }

        public  int peek() {
            if (s1.isEmpty()) {
                System.out.println("queue is empty");
                return -1;

            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        InnerUingStak obj = new InnerUingStak();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.remove();
            
        }
    }
}
