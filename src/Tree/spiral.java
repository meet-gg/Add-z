package Tree;
import static Tree.spiral.Bitr;
public class spiral {
    public static void main(String[] args) {
        BiTree.Bitr bt=new BiTree.Bitr();
        bt.root=new BiTree.Node(10);
        bt.root.left=new BiTree.Node(20);
        bt.root.right=new BiTree.Node(30);
        bt.root.left.left=new BiTree.Node(40);
        bt.root.left.right=new BiTree.Node(50);
        bt.root.right.left=new BiTree.Node(60);
        bt.root.right.right=new BiTree.Node(70);
        bt.root.right.right.left=new BiTree.Node(90);
    }
    public static class Bitr{

    }
}
