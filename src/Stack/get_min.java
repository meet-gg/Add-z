package Stack;
import java.util.Stack;
public class get_min {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack1=new Stack<>();
        push(stack,stack1,5);
        push(stack,stack1,500);
        push(stack,stack1,150);
        push(stack,stack1,200);
        push(stack,stack1,15);
        pop(stack,stack1);
        push(stack,stack1,80);
        pop(stack,stack1);
        getmin(stack1);
        push(stack,stack1,-170);
//        pop(stack,stack1);
        push(stack,stack1,-15);
//        pop(stack,stack1);
        push(stack,stack1,161);
        getmin(stack1);
    }
    public static void push(Stack<Integer> stack,Stack<Integer> stack1,int value){
        stack.push(value);
        if(stack1.isEmpty()){
            stack1.push(stack.peek());
        }
        else if(stack.peek()<=stack1.peek()){
            stack1.push(stack.peek());
        }
    }
    public static void pop(Stack<Integer> stack,Stack<Integer> stack1){
        int a=stack.pop();
        if(a==stack1.peek()){
            stack1.pop();
        }
    }
    public static void getmin(Stack<Integer> stack1){
        System.out.println(stack1.peek());
    }
}