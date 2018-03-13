package Trees;
import java.util.*;

/**
 * Created by kunal on 3/12/18.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 But the following [1,2,2,null,3,null,3] is not:
 1
 / \
 2   2
 \   \
 3    3
 */
public class SymmetricTree {

    public boolean isSymmetric(BinaryTreeNode root) {
        if(root==null) return true;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode t1= q.poll();
            BinaryTreeNode t2 = q.poll();
            if(t1==null && t2==null) continue;
            if(t1==null || t2==null) return false;
            if(t1.data!=t2.data) return false;
            q.offer(t1.left);
            q.offer(t2.right);
            q.offer(t1.right);
            q.offer(t2.left);
        }
        return true;
    }

    public boolean isSymmetricRecursion(BinaryTreeNode root) {
        if(root==null) return true;
        return isMirror(root,root);

    }
    public boolean isMirror(BinaryTreeNode t1, BinaryTreeNode t2){

        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        return (t1.data==t2.data) && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);

    }


    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(2);
        tree.left.left = new BinaryTreeNode(3);
        tree.left.right = new BinaryTreeNode(4);
        tree.right.left = new BinaryTreeNode(4);
        tree.right.right = new BinaryTreeNode(3);
        SymmetricTree s = new SymmetricTree();
        System.out.println(s.isSymmetric(tree));
    }

}
