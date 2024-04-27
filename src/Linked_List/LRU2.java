package Linked_List;

import java.util.HashMap;
import java.util.Scanner;

public class LRU2 {
    static HashMap<Integer, Node> hasmap = new HashMap<>();
    static Node head = null;
    static Node tail = null;
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(5);
        insert(6);
        search(2);
        insert(4);
        search(3);

        print(head);
    }

    public static void insert(int data) {
        if (hasmap.containsKey(data)) {

            Node node = hasmap.get(data);
            lastadd(node);
        } else {

            if (hasmap.size() >= n) {
                deletefirst();
            }

            Node newNode = new Node(data);
            hasmap.put(data, newNode);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
            }
            tail = newNode;
        }
    }

    public static boolean search(int data) {
        if (hasmap.containsKey(data)) {
            Node node = hasmap.get(data);
            lastadd(node);
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

    public static void lastadd(Node node) {
        if (node == tail) {
            return;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        node.next.prev = node.prev;
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
    }

    public static void deletefirst() {
        int key = head.data;
        hasmap.remove(key);
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
    }

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}

