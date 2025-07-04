package linked_list;



//LinkedList class Implementation (Collection Framework)


import java.util.*;


// class LL {

//    public static void main(String args[]) {

//        LinkedList<String> list = new LinkedList<String>();

//        list.add("is");

//        list.add("a");

//        list.addLast("list");

//        list.addFirst("this");

//        list.add(3, "linked");

//        System.out.println(list);


//        System.out.println(list.get(0));

//        System.out.println(list.size());  

//        list.remove(3);

//        list.removeFirst();

//        list.removeLast();

     

//        System.out.println(list);

//    }

// }







//Scratch Implementation (Important for BEGINNERS)

class Linked_list {


   Node head;

   private int size;


   Linked_list() {

       size = 0;

   }


   public class Node {  //create a class 

       String data;

       Node next;


       Node(String data) {    /// creating constucter


        

           this.data = data;

           this.next = null;

           size++;

       }

   }


   public void addFirst(String data) {

       Node newNode = new Node(data);

       newNode.next = head;

       head = newNode;

   }


   public void addLast(String data) {

       Node newNode = new Node(data);


       if(head == null) {

           head = newNode;

           return;

       }


       Node lastNode = head;

       while(lastNode.next != null) {

           lastNode = lastNode.next;

       }


       lastNode.next = newNode;

   }


   public void printList() {

       Node currNode = head;


       while(currNode != null) {

           System.out.print(currNode.data+" -> ");

           currNode = currNode.next;

       }


       System.out.println("null");

   }


   public void removeFirst() {

       if(head == null) {

           System.out.println("Empty List, nothing to delete");

           return;

       }


       head = this.head.next;

       size--;

   }


   public void removeLast() {

       if(head == null) {

           System.out.println("Empty List, nothing to delete");

           return;

       }


       size--;

       if(head.next == null) {

           head = null;

           return;

       }


       Node currNode = head;

       Node lastNode = head.next;

       while(lastNode.next != null) {

           currNode = currNode.next;

           lastNode = lastNode.next;

       }


       currNode.next = null;

   }


   public int getSize() {

       return size;

   }

 



   public static void main(String args[]) {

       Linked_list list = new Linked_list();

       list.addLast("is");

       list.addLast("a");

       list.addLast("list");

       list.printList();


       list.addFirst("this");

       list.printList();

       System.out.println(list.getSize());


    //    list.removeFirst();

    //    list.printList();


    //    list.removeLast();

    //    list.printList();

   }

}