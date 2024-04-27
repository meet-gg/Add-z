package Queue;

import java.util.HashMap;
import java.util.Scanner;
public class LRU {
    static HashMap<Integer, Node> hasmap = new HashMap<Integer, Node>();
    static Node head = null;
    static Node tail = null;
    static  int c=0;
    static Scanner sc=new Scanner(System.in);
    static int n= sc.nextInt();
    public static void main(String[] args){
        insert(1);
        insert(2);
        insert(3);
        insert(5);
        insert(6);
        serach(2);
        insert(4);
        serach(3);

        print(head);
    }

    public static void insert(int data) {

        Node newnode = new Node(data);
        hasmap.put(data, newnode);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        if(n<=hasmap.size())
        {
            removefirst();
        }
    }

    public static boolean serach(int data) {
        if (hasmap.containsKey(data)) {
            Node n = hasmap.get(data);
            delete(n);
            return true;
        }
        return false;
    }
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void delete(Node nod) {
//        int key = nod.data;
//        hasmap.remove(key);
//        insert(nod.data);
//        if (nod == head) {
//            head = head.next;
//        } else {
//            Node temp = head;
//            while (temp != null && temp.next != nod) {
//                temp = temp.next;
//            }
//            if (temp != null) {
//                temp.next = nod.next;
//            }
//        }
//        c--;
        insert(nod.data);
        nod.data = nod.next.data;
        hasmap.put(nod.data,nod.next);
        hasmap.remove(nod.next.data);
        nod.next = nod.next.next;
    }

    public static void removefirst()
    {
        int key = head.data;
        head = head.next;
        hasmap.remove(key);
    }
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
}