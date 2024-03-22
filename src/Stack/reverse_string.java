package Stack;
public class reverse_string {
    public static void main(String[] args) {
        String s="my name is meet";
        char[] c=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++) {
            top = push(c, top, s.charAt(i));
        }
        print(c,top);
    }
    private static int push(char[] c,int top,char value){
        if(top==c.length-1){
            System.out.println("stack is overflow");
        }
        top++;
        c[top]=value;
        return top;
    }
    private static void print(char[] c,int top){
        while (top>=0){
            System.out.print(c[top]);
            top--;
        }
    }
}