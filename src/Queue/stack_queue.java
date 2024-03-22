package Queue;

import java.util.LinkedList;
import java.util.Queue;

//stack using queue
public class stack_queue {
    static int peek=Integer.MIN_VALUE;
    static int prev=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Queue<Integer> queue1=new LinkedList<>();
        push(queue,10);
        push(queue,20);
        pop(queue,queue1);
        push(queue,30);
        push(queue,40);
        pop(queue,queue1);
        push(queue,50);
        pop(queue,queue1);
        push(queue,60);
        pop(queue,queue1);
//        print(queue);
        System.out.println(queue);
        peeek();
        System.out.println(isempty(queue));
    }

    private static boolean isempty(Queue<Integer> queue) {
        if (queue.size()==0){
            return true;
        }
        return false;
    }

    private static void peeek() {
        System.out.println(peek);
    }

    public static void push(Queue<Integer> queue,int value){
        prev=peek;
        peek=value;
        queue.add(value);

    }
    public static void pop(Queue<Integer> queue,  Queue<Integer> queue1){
        while (queue.size()!=1) {
            queue1.add(queue.poll());
        }
        queue.poll();
        while (!queue1.isEmpty()){
            queue.add(queue1.poll());
        }
        peek=prev;
    }

//    private static void print(Queue<Integer> queue){
//        for (int i=0;i<queue.size();i++){
//            System.out.print(queue.poll()+" ");
//        }
//    }
}
