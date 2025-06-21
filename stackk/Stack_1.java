class Stack {
    private int[] arr;  // Array to store stack elements
    private int top;  // Index of the top element
    private int size;  // Maximum size of the stack

    // Constructor
    Stack(int sizeStack) {
        arr = new int[sizeStack];
        size = sizeStack;
        top = -1;  // Stack is initially empty
    }

    // Push operation (O(1))
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
    }

    // Pop operation (O(1))
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation (O(1))
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Main class to test stack operations
public class Stack_1 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // Output: 30
        stack.display();  // Output: 30 20 10

        System.out.println("Popped element: " + stack.pop());  // Output: 30
        stack.display();  // Output: 20 10
    }
}
