package Trees;

/**
 * Created by kunal on 3/19/18.
 * Find  minimum element in BST
 */
public class MinElementinBST {

    public int MinElement(BinaryTreeNode root){

        if(root == null) return 0;

        while(root.left!=null){

            root= root.left;
        }

        return root.data;

    }

    //Recursive

    public int MinElementRec(BinaryTreeNode root){

        if(root == null) return 0;
        else if(root.left==null) return root.data;
        else return MinElementRec(root.left);


    }



    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(7);

        tree.left = new BinaryTreeNode(4);
        tree.right = new BinaryTreeNode(9);
        tree.left.left = new BinaryTreeNode(2);
        tree.left.left.right = new BinaryTreeNode(3);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(8);
        tree.right.right = new BinaryTreeNode(11);

        MinElementinBST m = new MinElementinBST();
        System.out.println(m.MinElementRec(tree));

    }
}
