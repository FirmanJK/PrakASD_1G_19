package P14;

public class BinaryTreeMain19 {
    public static void main(String[] args) {
        BinaryTree19 bt = new BinaryTree19();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Tranversal   : ");
        bt.tranversePreOrder (bt. root);
        System.out.println("");
        System.out.print("inOrder Tranversal    : ");
        bt.tranverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Tranversal  : ");
        bt.tranversePostOrder (bt.root);
        System.out.println("");
        System.out.println("Find Node : " +bt. find (5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Transversal  : ");
        bt. tranversePreOrder (bt.root);
        System.out.println("");
    }
}