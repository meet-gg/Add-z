package Tree;

public class BST {
    public static void main(String[] args) {
        bst bt=new bst();
        bt.insert(10);
        bt.insert(20);
        bt.insert(9);
        bt.insert(8);
        bt.insert(1);
        bt.insert(50);
        bt.insert(60);
        bt.insert(40);
        bt.insert(2);
        bt.insert(35);
        bt.inorder(bt.root);
//        bt.print();
        System.out.println();
        System.out.println(bt.search(bt.root,35));;
    }
    private static class bst{
        Node root;
        public void insert(int value){
            root=insert(root,value);
        }
//        public void print(){
//            inorder(root);
//        }
        public void inorder(Node r){
            if (r==null){
                return;}
            inorder(r.left);
            System.out.print(r.value+" ");
            inorder(r.right);}
        public Node insert(Node root,int value){
            if (root==null){
                root=new Node(value);
                return root;
            }
            else if (root.value>value){
                root.left=insert(root.left,value);
            }
            else{
                root.right=insert(root.right,value);
            }
            return root;
        }
        public void search(int data){
           search(root,data);
        }
        public boolean search(Node node,int data){
            if (node==null){
                return false;
            }
            if (node.value==data){
                return true;
            }
            if (node.value>data){
                return search(node.left,data);
            }
            else{
                return search(node.right,data);
            }
        }
    }
    private static class Node{
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
