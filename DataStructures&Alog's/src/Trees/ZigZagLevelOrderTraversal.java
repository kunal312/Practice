package Trees;
import java.util.*;
/**
 * Created by kunal on 3/20/18.
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
 ]

 */
public class ZigZagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(BinaryTreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if (root == null) return res;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean rightTr = true;
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> levels = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                root = q.poll();
                if (rightTr) {
                    levels.add(root.data);
                } else {
                    levels.add(0, root.data);

                }

                if (root.left != null) q.offer(root.left);
                if (root.right != null) q.offer(root.right);

            }
            rightTr = !rightTr;
            res.add(levels);

        }

        return res;


    }

    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(7);

        tree.left = new BinaryTreeNode(4);
        tree.right = new BinaryTreeNode(9);
        tree.left.left = new BinaryTreeNode(2);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(8);
        tree.right.right = new BinaryTreeNode(11);
        ZigZagLevelOrderTraversal z = new ZigZagLevelOrderTraversal();
        z.zigzagLevelOrder(tree);
    }
}
