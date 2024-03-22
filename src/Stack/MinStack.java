package Stack;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private int min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("stack is Empty");
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return stack.peek();
    }

    public int getMin() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(7);
        minStack.push(3);
        minStack.push(2);
        minStack.push(6);
        minStack.push(3);
        minStack.push(1);
        minStack.push(4);


        System.out.println("Min value: " + minStack.getMin());

        // Pop 3 times
        minStack.pop();
        minStack.pop();
        minStack.pop();

        System.out.println("Min value: " + minStack.getMin());
    }
}
