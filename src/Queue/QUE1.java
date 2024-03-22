package Queue;

import java.util.Arrays;
import java.util.Stack;

// 1 2 3 4 5 6
// if k=3   3 2 1 4 5 6
// if k=2   2 1 3 4 5 6
// if k=5   5 4 3 2 1 6
public class QUE1 {
    private static int enqueue(int[]  queue,int  value,int rear){
        rear++;
        queue[rear]=value;
        return rear;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=5;
        int[] queue=new int[arr.length];
        int front=-1,rear=-1;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()){
            rear=enqueue(queue,stack.pop(),rear);
        }
        for (int i=k;i<arr.length;i++){
            rear=enqueue(queue,arr[i],rear);
        }
        System.out.println(Arrays.toString(queue));
    }
}
