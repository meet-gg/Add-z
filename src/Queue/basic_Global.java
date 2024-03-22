package Queue;

public class basic_Global {
    static int[] arr=new int[5];
    static int front=-1,rear=-1;
    public static void main(String[] args) {
        int[] arr=new int[5];
        int front=-1,rear=-1;
        Enqueue(10);
        Enqueue(20);
        Enqueue(30);
        Enqueue(40);
//        Enqueue(50);
//        Enqueue(60);
        Dequeue();
        Dequeue();
//        front=Dequeue(arr,front,rear);
        print();
    }
    private static void Enqueue(int value){
        if(rear== arr.length-1){
            System.out.println("Queue is overflow");
            return;
        }
        rear++;
        arr[rear]=value;
    }
    private static int Dequeue(){
        if(front==rear){
            System.out.println("Queue is underflow");
            return front;
        }
        front++;
        return front;
    }
    private static void print(){
        for(int i=front+1;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}