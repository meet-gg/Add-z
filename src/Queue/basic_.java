package Queue;

public class basic_ {
    public static void main(String[] args) {
        int[] arr=new int[5];
        // jo aya front = 0 levi to chelle print ma i = front kaaravo
        // jo aya front = -1 levi to chelle print ma i = front + 1 kaaravo

        int front=-1,rear=-1;
        rear=Enqueue(arr,rear,10);
        rear=Enqueue(arr,rear,20);
        rear=Enqueue(arr,rear,40);
        rear=Enqueue(arr,rear,50);
//        rear=Enqueue(arr,rear,60);
//        rear=Enqueue(arr,rear,70);
//        rear=Enqueue(arr,rear,80);
        front=Dequeue(front,rear);
        front=Dequeue(front,rear);
//        front=Dequeue(arr,front,rear);
        print(arr,front,rear);
    }
    private static int Enqueue(int[] arr,int rear,int value){
        if(rear== arr.length-1){
            System.out.println("Queue is overflow");
            return rear;
        }
        rear++;
        arr[rear]=value;
        return rear;
    }
    private static int Dequeue(int front,int rear){
        if(front==rear){
            System.out.println("Queue is underflow");
            return front;
        }
        front++;
        return front;
    }
    private static void print(int[] arr,int front,int rear){
        for(int i=front+1;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}