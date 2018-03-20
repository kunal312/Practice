package Trees;
import java.util.*;
/**
 * Created by kunal on 3/19/18.
 * You need to find the largest value in each row of a binary tree.

 Example:
 Input:

 1
 / \
 3   2
 / \   \
 5   3   9

 Output: [1, 3, 9]
 */
public class LargestValueinEachRow {

    public List<Integer> largestValues(BinaryTreeNode root) {

        List<Integer> res = new ArrayList<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                BinaryTreeNode temp =q.poll();
                if(temp.data>max)
                    max =temp.data;
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            res.add(max);
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
        LargestValueinEachRow l = new LargestValueinEachRow();
        System.out.println(l.largestValues(tree));
    }
}
