package Queue;//package Queue;
//public class DoubleEndedQueue_ {
//    static int[] queue=new int[5];
//    static int f=-1,r=-1;
//    public static void main(String[] args) {
////        insert_first(10);
//        insert_last(60);
////        insert_last(70);
//        insert_first(70);
//        print();
//
//    }
//
//    private static void insert_last(int value) {
//        if (f==-1){
//            f=0;
//        }
//        else if((r+1)% queue.length==f || (f==-1 && r== queue.length-1)){
//            System.out.println("queue is full");
//            return;
//        }
//        r=(r+1)% queue.length;
//        queue[r]=value;
//    }
//
//    private static void insert_first(int value) {
//        if (rear<arr.length && front==0){
//            arr[front+1]=arr[front];
//        }
//        if (front==0){
//            System.out.println("queue is overflow");
//            return;
//        } else if (front==-1) { // rear
//            front=rear=0;
//            arr[front]=value;
//        }
//        else {
//            front--;
//            arr[front] = value;
//        }
//    }
//
//    private static void delete_last() {
//        if (f==-1){
//            System.out.println("queue is empty");
//            return;
//        }
//        else if (f==r){
//            f=r=-1;
//        }
//        else {
//            f=(f+1)% queue.length;
//        }
//    }
//
//    private static void delete_first() {
//        if (r==-1){
//            System.out.println("queue is empty");
//            return;
//        }
//        else if (f==r){
//            f=r=-1;
//        }
//        else {
//            f=(f+1)% queue.length;
//        }
//    }
//    private static void print(){
//        if (front==-1){
//            System.out.println("empty");
//            return;
//        }
//        for(int i=front;i<=rear;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
