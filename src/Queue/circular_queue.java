package Queue;

public class circular_queue {
    static int[] queue=new int[6];
    static int f=-1;
    static int r=-1;
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        dequeue();
        dequeue();
        dequeue();
        dequeue();
//        dequeue();
        enqueue(20);
        enqueue(30);
        dequeue();
        enqueue(40);
        enqueue(90);
        dequeue();
        enqueue(900);
        printt();
    }

    private static void printt() {
        if (r==-1){
            System.out.println("queue is empty");
            return;
        }
        int i=f;
        while (i!=r){
            System.out.print(queue[i]+" ");
            i=(i+1)% queue.length;
        }
        System.out.print(queue[i]);

    }

    private static void dequeue() {
        if (r==-1){
            System.out.println("queue is empty");
            return;
        }
        else if (f==r){
            f=r=-1;
        }
        else {
            f=(f+1)% queue.length;
        }
    }
    private static void enqueue(int value) {
        if (f==-1){
            f=0;
        }
        else if((r+1)% queue.length==f){
            System.out.println("queue is full");
            return;
        }
            r=(r+1)% queue.length;
            queue[r]=value;
    }
}
