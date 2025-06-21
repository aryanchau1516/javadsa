
class Solution {
    Node insertAtEnd(Node head,int  x) {
      Node temp = new Node(x);
      Node tail = head;
      if(head!=null){
            while(tail.next!=null){
                tail=tail.next;
            }
            tail.next = temp;
            temp.next=null;
            return head;
      }
      else{
          return temp;
      }
      
            
    }
}