package Stack;                  // TIME : O(1)    SPACE : O(n)

import java.util.Stack;

public class Getmin {
    public static void main(String[] args) {
        int[] arr = {10, 14, 3, 100, 7, 21, 3, -150};

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            pushElements(stack, minStack, arr[i]);
        }

        System.out.println(stack);
        System.out.println(minStack);
        System.out.println("Min value: " + getMin(minStack));

        // 3 time pop
//        popElements(stack, minStack);
//        popElements(stack, minStack);
//        popElements(stack, minStack);

        System.out.println(stack);
        System.out.println(minStack);
        System.out.println("Min value: " + getMin(minStack));
    }
    public static void pushElements(Stack<Integer> stack, Stack<Integer> minStack, int val) {
        if (stack.isEmpty() && minStack.isEmpty()) {
            stack.push(val);
            minStack.push(val);
        } else {
            stack.push(val);
            if (minStack.peek() >= val) {
                minStack.push(val);
            }
        }
    }

    public static void popElements(Stack<Integer> stack, Stack<Integer> minStack) {
        if (stack.peek() == minStack.peek()) {
            stack.pop();
            minStack.pop();
        }
        if (stack.peek() != minStack.peek()) {
            stack.pop();
        }
    }

    public static int getMin(Stack<Integer> st) {
        return st.peek();
    }
}
