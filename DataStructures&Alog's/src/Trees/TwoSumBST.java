package Trees;

import java.util.*;

/**
 * Created by kunal on 3/19/18.
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

 Example 1:
 Input:
 5
 / \
 3   6
 / \   \
 2   4   7

 Target = 9

 Output: True
 Example 2:
 Input:
 5
 / \
 3   6
 / \   \
 2   4   7

 Target = 28

 Output: False
 */
public class TwoSumBST {

    //Method: hashset and use normal two sum logic using bFs
    //Method2: We know inorder is sorted for BST then we can use two pointer one from start and end to find the sum.
    public boolean findTarget(BinaryTreeNode root, int k) {

        if(root==null) return false;

        HashSet<Integer> set = new HashSet<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            root=q.poll();
            if(set.contains(k-root.data)) return true;
            set.add(root.data);

            if(root.left!=null) q.offer(root.left);

            if(root.right!=null) q.offer(root.right);

        }
        return false;

    }

    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(7);

        tree.left = new BinaryTreeNode(4);
        tree.right = new BinaryTreeNode(9);
        tree.left.left = new BinaryTreeNode(2);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(8);
        tree.right.right = new BinaryTreeNode(11);
        TwoSumBST t = new TwoSumBST();
        System.out.println(t.findTarget(tree,22));
    }



}
