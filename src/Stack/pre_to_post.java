package Stack;
import java.util.Stack;
public class pre_to_post {
    public static void main(String[] args) {
        String s="*+ab+cd";
        Stack<String> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                stack.push(String.valueOf(s.charAt(i)));
            }
            else {
                String op1= stack.pop();
                String op2= stack.pop();
                stack.push(op1 + op2 + String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.pop());
    }
}
