package Stack;

import java.util.Stack;

public class delete_midle {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack1=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(60);
        stack.push(70);
//        System.out.println(stack);
        int n=stack.size()/2;
        for (int i=0;i<n;i++){
            stack1.push(stack.pop());
        }
//        System.out.println(stack);
//        System.out.println(stack1);
        stack.pop();
        while (!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
        System.out.println(stack);
    }
}
