package linked_list;

import pattern.he;
// delete at position
public class LinkedList_5 {
    public class Node {
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        Node head=null;
        Node tail = null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void deleteAtindex(int index){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
             if(index>size()){
                return;
            }
            Node temp = head;
             if(index==size()){
               head=temp.next;
              return;
            }
            else{
         
          for(int i=1;i<index-1;i++){
            temp = temp.next;
            System.out.println(temp.data);
          }
          temp.next = temp.next.next;

        }}
        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count =0;
            while (temp!=null) {
                temp=temp.next;
                count++;
            }
            return count; 
        }
        
   
    public static void main(String[] args) {
        LinkedList_5 obj = new LinkedList_5();
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
       
        obj.insertAtEnd(3);
        obj.insertAtEnd(4);
        obj.insertAtEnd(5);
        obj.insertAtEnd(6);
        System.out.println(obj.size());
        obj.deleteAtindex(1);
       
        System.out.println(obj.tail);
        obj.display();
    }
    
}
