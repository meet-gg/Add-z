package Leetcode;

import java.util.Stack;

public class sssss {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        int a=stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.add(a);
        System.out.println(stack);
    }
}
