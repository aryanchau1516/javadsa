/*
 * this is implementation of tack using singly linked list
 */


public class StackLL_1 {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    boolean isEmpty() { // when stack is empty
        return head == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int delete = head.data;
        head = head.next;
        return delete;
    }

    int peekEle(){
        if(isEmpty()){
            return -1;
        }

        return head.data;  // return the peek ele
    }

    void display(){
        while (!isEmpty()) {
            System.out.print(pop()+" ");  // but ths way whole stack is ggetting empty
            
        }
    }
    void display2(){
        while (!isEmpty()) {
            System.out.print(peekEle()+" ");  // or   but also this way whole stack is ggetting empty
            pop();
        }
    }

    public static void main(String[] args) {
        StackLL_1 obj = new StackLL_1();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.display2();
    }

}
