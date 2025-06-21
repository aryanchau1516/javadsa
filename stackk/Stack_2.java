public class Stack_2 {
    public static class Stack {
        final int size=6;
        int arr[] = new int[size];
        int top =0;

        void push(int data){
            if(top==size-1){
                System.out.println("Stack overflow");
                return;
            }
            top++;
            arr[top]=data;
           // top++;
        }
            int pop(){
                if (top==0) {
                    return -1;
                }
              
                return arr[top--];
            }
            int peek(){
                if (top==0) {
                    return -1;
                }
                return arr[top];
            }
        void display(){
            while (top>0) {
                System.out.print(arr[top]+" ");
                top--;
            }
        }
    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
       System.out.println( obj.pop());
      
        System.out.println(obj.peek());
        obj.display();
    }
}
