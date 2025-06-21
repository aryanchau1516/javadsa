/*
 * reverse a stack completely 
 * 
 * before reverse stack       [100, 200, 300, 400]
   After revese completly stack [400, 300, 200, 100]


 * in 0(n)  time complexity
 * in 0(1)  space complexity without extra memory
 * it reverse stack completly 
 * 
 * so we we pop elemnet of stackl add in the poshAtBottm int h
 */

import java.util.*;

public class ReverseStackComp {
   static void reverse(Stack<Integer> s){
    if(s.isEmpty()){
        return;
    }
    int top = s.pop();
    reverse(s);
    pushAtBottom(s, top);


   }
   static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);

   }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        System.out.println("before reverse stack "+st);  //  [100, 200, 300, 400]
       
        reverse(st);
        System.out.println("After revese totally stack "+st);  // [400, 300, 200, 100]

   
    }
    
    }
