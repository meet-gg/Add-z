package Linked_List;

import java.util.HashMap;

public class LRU {
    public static class Node{
        Node prev;
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static class DDll {
        public static Node head;
        public static Node tail;

        public void insert(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
            } else {
                tail.next = newnode;
                newnode.prev = tail;
                tail = newnode;
            }
        }

        public void sortdele() {
            Node temp = head;
            while (temp != null && temp.next != null) {
                if (temp.data == temp.next.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }

        public void delete(int data) {
            if (head.data == data && head == tail) {
                head = tail = null;
            } else if (head.data == data) {
                head = head.next;
                head.prev = null;
            } else if (tail.data == data) {
                tail = tail.prev;
                tail.next = null;
            } else {
                Node temp = head;
                Node prev = head;
                while (temp.data != data) {
                    prev = temp;
                    temp = temp.next;
                }
                prev.next = prev.next.next;
                prev.next.prev = prev;
            }
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
//            Node node = new Node(20);
            DDll dl = new DDll();
            dl.insert(10);
            dl.insert(20);
            dl.insert(30);
            dl.insert(50);
            dl.insert(20);
//            dl.insert(50);
//            dl.insert(50);
//            dl.insert(60);
//            dl.print();
//            System.out.println();
//            System.out.println();
//            dl.sortdele();
            int n=3;
            HashMap<Integer,Node> map=new HashMap<>();
//            map

        }
    }
}
