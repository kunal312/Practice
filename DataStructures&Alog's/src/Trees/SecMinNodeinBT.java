package Trees;
import java.util.*;
/**
 * Created by kunal on 3/10/18.
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.

 Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.

 If no such second minimum value exists, output -1 instead.

 Example 1:
 Input:
 2
 / \
 2   5
 / \
 5   7

 Output: 5
 Explanation: The smallest value is 2, the second smallest value is 5.
 Example 2:
 Input:
 2
 / \
 2   2

 Output: -1
 Explanation: The smallest value is 2, but there isn't any second smallest value.

 *
 */
public class SecMinNodeinBT {
    public int findSecondMinimumValue(BinaryTreeNode root) {
        int res = Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE;
        int minVal = 0;
        if(root==null) return -1;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            root = q.poll();
            minVal=root.data;
            if(minVal<res){
                secmin = res;
                res=minVal;
            }else if(minVal<secmin && minVal>res){
                secmin= minVal;
            }
            if(root.left!=null) q.offer(root.left);
            if(root.right!=null) q.offer(root.right);
        }
        if(secmin==Integer.MAX_VALUE)
            return -1;
        else
            return secmin;


    }

    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(2);
        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(5);
        tree.right.right = new BinaryTreeNode(7);

        SecMinNodeinBT s = new SecMinNodeinBT();
        System.out.println(s.findSecondMinimumValue(tree));
    }


}
