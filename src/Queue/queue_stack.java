package Queue;
//queue using stack
import java.util.Stack;

public class queue_stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();
        insert(s,10);
        insert(s,20);
        insert(s,30);
        insert(s,40);
        remove(s,s1);
        remove(s,s1);
        insert(s,50);
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    private static void remove( Stack<Integer> s,Stack<Integer> s1){
        while (!s.isEmpty()){
            s1.push(s.pop());
        }
        s1.pop();
        while (!s1.isEmpty()){
            s.push(s1.pop());
        }
    }
    private static void insert( Stack<Integer> s,int value){
        s.push(value);
    }
/*
    private static void print( Stack<Integer> s){
       while (!s.isEmpty()){
           System.out.print(s.pop()+" ");
       }
    }
*/
}
