package Stack;

import java.util.Stack;

//a*(b+c)
public class post_to_in {
    public static void main(String[] args) {
        String s="ab+cd+*";
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                stack.push(String.valueOf(s.charAt(i)));
            } else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push('(' + op2 + String.valueOf(s.charAt(i))+op1 + ')');

            }
        }
        System.out.println(stack.pop());
    }
}
