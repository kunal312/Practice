package Trees;

/**
 * Created by kunal on 3/19/18.
 * Find an element in binary search tree
 */
public class BSTSearch {


    //Iteration
    public boolean Find(BinaryTreeNode root,int data){

        if(root ==null) return false;
        while(root!=null){

            if(root.data == data) return true;

            if(data<root.data) root=root.left;
            else
                root=root.right;
        }

        return false;

    }

    //Recursion
    public boolean FindRec(BinaryTreeNode root,int data){

        if(root ==null) return false;

        if(root.data==data) return true;

        else if(data<root.data)
            return FindRec(root.left,data);
        else
            return FindRec(root.right,data);




    }

    public static void main(String[] args) {

        BinaryTreeNode tree = new BinaryTreeNode(7);

        tree.left = new BinaryTreeNode(4);
        tree.right = new BinaryTreeNode(9);
        tree.left.left = new BinaryTreeNode(2);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(8);
        tree.right.right = new BinaryTreeNode(11);

         BSTSearch s = new BSTSearch();
        System.out.println(s.FindRec(tree,11));

    }

}
