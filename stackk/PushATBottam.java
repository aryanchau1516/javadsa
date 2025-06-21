import java.util.Stack;

public class PushATBottam {
    // using recursion.......
    public static void pushAB(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);  // when stack is empty then push data so data is automaticaaly pushed at the bottm
            return;
        }
        int top = s.pop();
        pushAB(s, data);
        s.push(top); // when recursion collect value then it collect

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(23);
        s.push(4);
        s.push(6);
        s.push(9);
        pushAB(s,6);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
       System.out.println(s);
    }
}
