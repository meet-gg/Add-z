package Linked_List;

public class remove_duplicate {
    public static void main(String[] args) {
        list l=new list();
        l.insert(1);
        l.insert(2);
        l.insert(2);
        l.insert(3);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(5);
        l.insert(6);
        l.insert(8);
        l.insert(8);
        l.insert(7);
        l.insert(2);
        l.insert(2);
        l.insert(2);
        l.insert(2);
        l.insert(9);
       l.removeduplicate();
    }
}
class list{
    Nnode head,tail;

    public void insert(int data) {
        Nnode newnode=new Nnode(data); // insert new node
        if(head==null){
            head=tail=newnode;
        }
        else {   // insert alast node
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void removeduplicate() {
        Nnode temp=head;
        while (temp!=null && temp.next==null){
            if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else {
//            System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        pprint();
    }
    public void pprint() {
        if (head==null){
            System.out.println("ll is Empty");
            return;
        }
        Nnode temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class Nnode{
    int data;
    Nnode next;

    public Nnode(int data) {
        this.data=data;
    }
}
