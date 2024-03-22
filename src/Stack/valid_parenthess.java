package Stack;

import java.util.Stack;

public class valid_parenthess {
    public static void main(String[] args) {
        String s="(({[]}))";
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if ((s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='[')
                    ||(s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{')
                    ||(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(')){
                stack.pop();
            }
            else {
                System.out.println("false");
                return;
            }
        }
        System.out.println(stack.isEmpty());
    }
}
