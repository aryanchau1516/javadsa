// stack implementation using ArrayList

import java.util.ArrayList;

public class Stack1 {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        // push
        public static void push(int data){

            list.add(data);
        }
        // pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
                
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }
        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
                
            }
            return list.get(list.size()-1);
        }
        public static void main(String[] args) {
            stack obj = new stack();
            obj.push(3);
            obj.push(2);
            obj.push(56);
            obj.push(7);
            // while (!obj.isEmpty()) {
            //     System.out.println(obj.peek());
            //     obj.pop();
                
           // }
           obj.pop();
              while (!obj.isEmpty()) {
                System.out.println(obj.peek());
                obj.pop();
                
           }
        }
    }
}
