package Stack;

import java.util.Stack;

public class valid_parenthess_2 {
    public static void main(String[] args) {
        String s="{[()[(])]}";
        Stack<Character> stack=new Stack<>();

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else {
//                if (stack.isEmpty()){
//                    System.out.println("not balanced");
//                    return;
//                }
//                 {
                    char c= stack.pop();
                    if ((s.charAt(i)==']' &&  c!='[')
                            ||(s.charAt(i)=='}' &&  c!='{')
                            ||(s.charAt(i)==')' && c!='(') ){
//                        stack.pop();
                        System.out.println("not balanced ");
                        return;
                    }
//                }

            }
        }
        if (stack.isEmpty()){
            System.out.println("balanced");
            return;
        }
        else {
            System.out.println("not balanced");
        }
//        System.out.println(stack.isEmpty());
    }
}
