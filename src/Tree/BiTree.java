package Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//                10
//        20              30
//    40      50      60         70

public class BiTree {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
//        bt.root.right.right.left = new Node(90);
        System.out.println("BFS");
        bt.print();
        System.out.println();
        System.out.println("DFS");
        System.out.print("INORDER : ");
        bt.inorder(bt.root);
        System.out.println();
        System.out.print("PREORDER : ");
        bt.preorder(bt.root);
        System.out.println();
        System.out.print("POSTORDER :");
        bt.postorder(bt.root);
        System.out.println();
        System.out.println();
        bt.pre(bt.root);
        System.out.println();
//        bt.in(bt.root);
        System.out.println();
        bt.postOrderTraversal(bt.root);
        System.out.println();

//        System.out.print("No. of nodes : ");
//        bt.count_nodes();
//        System.out.println();
//        bt.Nth_node(bt.root);
//        System.out.println();
//        bt.biser(bt.root, 3);
//        System.out.println();
//        System.out.println();
//        System.out.println(bt.height(bt.root));
//        System.out.println(bt.search(bt.root, 9, false));
        System.out.println("zig zag ");
        bt.zigzag(bt.root);
    }

    public static class Bitr {
        Node root;
        public static int count = 0;
        //        public static boolean flag=false;
        public static Node temp = null;
        public static int count1 = 0;
        public static int c = 0;

        public void print() {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node n = q.poll();
                count++;
                System.out.print(n.value + " ");
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
        }

        public void inorder(Node n) {
            if (n == null) {
                return;
            }
            inorder(n.left);
            System.out.print(n.value + " ");
            inorder(n.right);
        }

        public int height(Node n) {
            if (n == null) {
                return 0;
            }
            int leftt = height(n.left);
            int rightt = height(n.right);
            return Math.max(leftt, rightt) + 1;
        }

        public void biser(Node n, int pos) {
            if (n == null) {
                return;
            }
//            if(count1<pos) {
            biser(n.left, pos);
            count1++;
            if (count1 == pos) {
                temp = n;
                System.out.println(temp.value);
                return;
            }
            biser(n.right, pos);
//            }
        }

        public boolean search(Node n, int ele, boolean flag) {
            if (n == null) {
                return false;
            }
            search(n.left, ele, flag);
            if (n.value == ele) {
                flag = true;
                return true;
            }
            search(n.right, ele, flag);
            flag = false;
            return flag;
        }

        public void preorder(Node n) {
            if (n == null) {
                return;
            }
            System.out.print(n.value + " ");
            preorder(n.left);
            preorder(n.right);
        }
        public void postorder(Node n) {
            if (n == null) {
                return;
            }
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.value + " ");
        }

        public void count_nodes() {
            System.out.print(count);
        }

        public void pre(Node root){
            Stack<Node> s=new Stack<>();
            s.push(root);
            while (!s.isEmpty()){
                Node n=s.pop();
                System.out.print(n.value+" ");
                if (n.right!=null){
                    s.push(n.right);
                }
                if (n.left!=null){
                    s.push(n.left);
                }
            }
        }
        //         10
//        20              30
//    40      50      60         70

        //         10
//        20              30
//    40      50      60         70
        public void inOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            Stack<Node> stack = new Stack<>();
            Node current = root;

            while (!stack.isEmpty()) {
                // Traverse to the leftmost node
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }

                current = stack.pop();
                System.out.print(current.value + " ");

                current = current.right;

            }
        }

        public void postOrderTraversal(Node root) {
            Stack<Node> stack = new Stack<>();
            Stack<Integer> stack1 = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node n = stack.pop();
                stack1.push(n.value);
                if (n.left!=null){
                    stack.push(n.left);
                }
                if (n.right!=null){
                    stack.push(n.right);
                }
            }
            while (!stack1.isEmpty()){
                System.out.print(stack1.pop()+" ");
            }
        }


        public int Nth_node(Node n) {
            if (c == 2) {
                System.out.println(n.value);
                return c;
            }
            inorder(n.left);
            c++;
            inorder(n.right);
            return 0;
        }

        public void zigzag(Node root) {
            boolean flag = true;
            Deque<Node> dq=new LinkedList<>();
            dq.add(root);
            while (!dq.isEmpty()){
                int size=dq.size();
                    if (flag){
                        while (size>0){
                            Node n = dq.pollFirst();
                            System.out.print(n.value + " ");
                            if (n.left != null) {
                                dq.addLast(n.left);
                            }
                            if (n.right != null) {
                                dq.addLast(n.right);
                            }
                            size--;
                        }
                    }
                    else {
                        while (size>0){
                            Node n = dq.pollLast();
                            System.out.print(n.value + " ");
                            if (n.right!=null){
                                dq.addFirst(n.right);
                            }
                        if (n.left!=null){
                            dq.addFirst(n.left);
                        }
                        size--;
                    }
                }
                flag=!flag;
            }
        }
    }

        public static class Node {
            int value;
            Node left, right;

            public Node(int value) {
                this.value = value;
            }
        }
    }
