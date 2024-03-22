package Stack;

import java.util.Stack;

//a*(b+c)
public class pre_to_in {
    public static void main(String[] args) {
        String s="*+ab+cd";
        Stack<String> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
//                char sb=s.charAt(i);
                stack.push(String.valueOf(s.charAt(i)));
            } else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push('(' + op1 + String.valueOf(s.charAt(i))+op2 + ')');

            }
        }
        System.out.println(stack.peek());
    }
}
