package Stack;

public class basic {
    public static void main(String[] args) {
        int[] stack=new int[5];
        int top=-1;
        top =push(stack,top,10);
        top =push(stack,top,20);
        top =push(stack,top,30);
//        top =push(stack,top,40);
//        top =push(stack,top,50);
//    print(stack,top);
//        System.out.println();
        top=pop(stack,top);
        print(stack,top);
//        top =push(stack,top,50);
//        top =push(stack,top,60);
//        System.out.println();
//        top =push(stack,top,70);
//        top=pop(stack,top);
//        System.out.println();
//        print(stack,top);
    }

    private static int pop(int[] stack, int top) {
        if(top==-1){
            System.out.println("stack is underflow");
            return top;
        }
        System.out.println(stack[top]+ " element popped");
        top--;
        return top;
    }

    private static int push(int[] stack, int top, int value) {
        if(top==stack.length-1){
            System.out.println("stack overflow");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
    private static void print(int[] stack, int top) {
        while (top>=0){
            System.out.print(stack[top]+" ");
            top--;
        }
//        return top;
    }



}
