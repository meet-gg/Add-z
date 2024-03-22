package Leetcode;

import java.util.Stack;
public class leet682 {
    public static void main(String[] args) {
        String[] operations = {"5","-2","4","C","D","9","+","+"};
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+")) {
                stack.push(operations[i]);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                stack.push(String.valueOf(2*Integer.parseInt(stack.peek())));
            } else if (operations[i].equals("+")) {
               String a = stack.pop();
               String b=stack.pop();
               stack.push(b);
                stack.push(a);
                stack.push(String.valueOf(Integer.parseInt(a) + Integer.parseInt(b)));
            }
        }
        int sum=0;
        while (!stack.isEmpty()){
            sum+=Integer.parseInt(stack.pop());
        }
        System.out.println(sum);
    }
}
