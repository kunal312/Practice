package Trees;
import java.util.*;

/**
 * Created by kunal on 3/10/18.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]
 *
 *
 */
public class LeverOrderTraversal2 {


    public List<List<Integer>> levelOrderBottom(BinaryTreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        Stack<List<Integer>> s = new Stack<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> subres = new ArrayList<>();
            Queue<BinaryTreeNode> temp = new LinkedList<>();
            while(!q.isEmpty()){
                root = q.poll();
                subres.add(root.data);
                if(root.left!=null){
                    temp.offer(root.left);
                }
                if(root.right!=null){
                    temp.offer(root.right);
                }
            }
            q=temp;
            res.add(0,subres);
        }
        return res;

    }

    public static void main(String[] args) {

        BinaryTreeNode tree = new BinaryTreeNode(1);

        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);

        LeverOrderTraversal2 l = new LeverOrderTraversal2();
        l.levelOrderBottom(tree);
    }





}
