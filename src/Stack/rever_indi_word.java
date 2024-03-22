package Stack;

public class rever_indi_word {
    public static void main(String[] args) {
        String s="how are you";
        char[] stack=new char[s.length()];
        int top=-1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                top=push(stack,top,s.charAt(i));
            }
            else {
                print(stack,top);
                top=-1;
            }
        }
        print(stack,top);
    }
    private static int push(char[] stack, int top, char value) {
        if(top==stack.length-1){
            System.out.println("stack overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
    private static void print(char[] stack, int top) {
        while (top>=0){
            System.out.print(stack[top]);
            top--;
        }
        System.out.print(" ");
    }
}
