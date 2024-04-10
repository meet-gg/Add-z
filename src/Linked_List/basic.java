package Linked_List;

public class basic {
    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
//        ll.insert(100);
//        ll.insert(200);
//        ll.insert(300);
//        ll.insert(400);
//        ll.insert(500);
//        ll.removeduplicate();
//        ll.print();
//        System.out.println();
//        System.out.println("get element");
//        ll.firstget(3); // first thi kth element gotava mate
//        ll.update(20,70);
//        System.out.println();
//        System.out.println("after delete");
//        ll.delete(30);
//        ll.delete(100);
//        ll.print();//
//        System.out.println();
//        ll.count();
//        ll.lastget(5);
//        System.out.println();
//        ll.print();
//        System.out.println();
//        ll.printrev();
//        System.out.println();
//        System.out.printf("middle node is  : ");
//        ll.middle();
//
//        System.out.println();
//        ll.insert(1);
//        ll.insert(2);
//        ll.insert(3);
//        ll.insert(4);
//        ll.insert(5);
//        ll.print();
//        System.out.println();
//        ll.delete(1);
//        ll.deletenth(6);
//        ll.print();
//        System.out.println();
//        ll.easymiddle();
//        ll.tailprint();
        ll.link();
//        ll.loop();
//        ll.looplength();
        ll.check();
//        ll.looplength();
    }
}
class Linklist{
    Node head,tail;
    int scount;
    public void insert(int data) {
        Node newnode=new Node(data); // insert new node
        if(head==null){
            head=tail=newnode;
            scount++;
        }
        else {   // insert alast node
            tail.next=newnode;
            tail=newnode;
            scount++;
        }
    }

    public void delete(int data) {
        if (head.data==data && head==tail){ // only one element
            head=tail=null;
            scount--;
        }
        else if(head.data==data){ // first element delete thay
            head=head.next;
            scount--;

        } else if (tail.data==data) { // last element delete karva mate
            Node prev=head;
            Node temp=head;
            while (temp!=tail){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            tail=prev;
            scount--;
        }
        else { // delete between
            Node prev=head;
            Node temp=head;
            while(temp.data!=data){
                prev=temp;
                temp=temp.next;
            }
            prev.next=prev.next.next;
            scount--;
        }
    }

    public void print() {
        if (head==null){
            System.out.println("ll is Empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void firstget(int data) {
        Node temp=head;
        int count=1;
        while (temp!=null){
            if(count==data){
                System.out.println(temp.data);
                break;
            }
            count++;
            temp=temp.next;
        }
    }
    public void easymiddle(){ /// for find the middle easy slow fast method
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public Node middle(Node head){ /// for check palindrome
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean CkeckPalindrome(){
        // for single node and not any of node
        if(head==null || head.next==null){
            return true;
        }
        // find middle
        Node midnode=middle(head);
        // reverse middle to upto tail
        Node prev=null;
        Node curr=midnode;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // check for the palindrome
        Node right=prev;
        Node left=head;
        while (right!=null){
            if (left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public void update(int cvalue, int uvalue) {
        Node temp=head;
        while (temp!=null) {
            while (temp.data == cvalue) {
                temp.data = uvalue;
                return;
            }
            temp=temp.next;
        }
        if (temp==null){
            System.out.println("Enter valid position for get element");
            return;
        }
    }
    public void looplength(){  //Loop ma total ketala nodes include che te count karva mate
        Node slow = head;
        Node fast = head;
        int cnt=0;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                slow=slow.next;
                cnt++;
                while (slow!=fast){
                    slow=slow.next;
                    cnt++;
                }
                System.out.println(cnt);
                return;
            }
        }
    }
    public  void loop(){ /// loop cheke nai te chakasva mate
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                System.out.println("Loop is present.");
                return;
            }

        }

        System.out.println("Loop is not present.");
    }
    public void tailprint(){
        //print without tail
        Node temp=head;
        int count=0;
        Node prev=head;
        while (temp!=null){
//            if (temp.next==null){
//                temp.next=head;
//            }
//            System.out.println(temp.data);
            prev=temp;
            temp=temp.next;
            count++;
        }
        Node ans=prev;
        prev.next=head;
        while(count<scount)
        {
            System.out.println(head.next);
        }
    }
    public void check(){
        Node slow=head;  //  link thay che to kya node thi thay che te node return
        Node fast=head;
        boolean cycle=false;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                cycle = true;
                break;
        }
        }
        if (cycle==false){
            return;
        }
        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
    }

    public void link() {
        tail.next=head.next.next;
    }

    public int lastget(int position) {
        Node temp=head;
        int count=1;
        while (temp!=null){
            if(scount-count+1==position){
//                System.out.println("last to "+position+" element "+temp.data);
                return temp.data;
            }
            count++;
            temp=temp.next;
        }
//        if (temp==null){
//            System.out.println("Enter valid position for get element");
            return -1;
//        }

    }
    public void printreverse(Node head) {
        if (head==null){
            return;
        }
        printreverse(head.next);
        System.out.print(head.data+" ");
//        if (head==null){
//            System.out.println("ll is Empty");
//            return;
//        }
//        Node temp=head;
//
////        if(prev==null){
////            return;
////        }
//        while (temp!=head){
//            Node prev=head;
//            printreverse(head.next);
//            System.out.print(temp.data+" ");
//            prev=temp;
//            temp= temp.next;
//        }
//        prev.next=null;
    }
    public void printrev() {
        printreverse(head);
    }
    public void count() {
        System.out.println("total node = " + scount);
    }
    public void middle() {
        Node temp=head;
        int count=0;
        while(temp!=null){
            if (count==scount/2){
                System.out.print(temp.data+" ");
                return;
            }
            count++;
            temp=temp.next;
        }
    }
    public void swp(){
        Node pre=head;
        Node temp=head;
        while (temp!=null){
            pre=temp;
            temp=temp.next;
        }
        while (pre.next.next!=head){

        }

    }
    public void deletenth(int position){
        delete(lastget(position));
    }

}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
}