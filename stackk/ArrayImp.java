// this is the implementation of stack in 
public class ArrayImp {
    int[] arr = new int[10];
    int idx = 0;

    void push(int ele) {
        if (isFull()) {
            System.out.println("stack is full");
            return;
        }

        arr[idx] = ele;
        idx++;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poped = arr[idx-1];
        idx--;
        return poped;
    }

    void show() {
        int t = idx-1;
        while (t >= 0) {
            System.out.print(arr[t] + " <- ");
            t--;
        }
    }

    int peek() {
        if (idx == 0) {
            System.out.println("stack is empty");
            return -1;
        } else {
            return arr[idx-1];
        }
    }

    int size() {
        return idx;
    }

    boolean isEmpty() { // for t check empty or not
        if (idx == 0) {
            return true;
        }

        else {
            return false;
        }
    }
    
    boolean isFull() {
        if (idx == arr.length) {
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        ArrayImp st = new ArrayImp();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.show();
        System.out.println();
        System.out.println("peek ele : "+st.peek());
        System.out.println("Size of stack : "+st.size());
        
    }
}
