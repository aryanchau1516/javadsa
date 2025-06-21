package queue;


 class InnerQueueLL {
    
        
   
  static  public class Node {
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    
    }
    static Node head = null;
    static Node tail = null;

   void add(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }

        else{
            temp.next=head;
            head = temp;
        }
    }

    boolean isEmpty(){
        return head == null && tail == null;
    }

     int remove(){
        if(isEmpty()){
            return -1 ;
        }
       int front= head.data;
       if(tail==head){  // when single elment
        head=tail=null;
       }
       else{
        head = head.next;
       }

       return front;  // return first ele
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("empty wueue");
            return -1;
        }
        return head.data;
    }
    void dis()
    {
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
            
        }
    }
    }
    
public class QueueLL {
public static void main(String[] args) {
    InnerQueueLL obj = new InnerQueueLL();
    obj.add(1);
    obj.add(2);
    obj.add(3);
    obj.add(4);
  System.out.println( obj.peek());
  
    
}
    
}
