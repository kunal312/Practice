package Trees;
import java.util.*;
/**
 * Created by kunal on 3/12/18.
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

 For example:
 Given the below binary tree and sum = 22,

 5
 / \
 4   8
 /   / \
 11  13  4
 /  \      \
 7    2      1
 return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */


public class PathSum {
    public boolean hasPathSum(BinaryTreeNode root, int sum) {

    Stack<BinaryTreeNode> stack = new Stack<>();
    int psum=0;

    BinaryTreeNode curr = root;
    BinaryTreeNode pre = null;

    while(curr!=null || !stack.isEmpty()){

        while(curr!=null){
            stack.push(curr);
            psum+=curr.data;
            curr=curr.left;
        }

        curr=stack.peek();
        if(curr.right!=null && curr.right!=pre){
            curr=curr.right;
            continue;
        }

        if(curr.left==null && curr.right==null && psum==sum){
            return true;
        }

        pre =curr;
        stack.pop();
        psum-=curr.data;
        curr =null;

    }

        return false;

    }

    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(5);

        tree.left = new BinaryTreeNode(4);
        tree.right = new BinaryTreeNode(8);
        tree.left.left = new BinaryTreeNode(11);
        //tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(13);
        tree.right.right = new BinaryTreeNode(4);
        tree.left.left.left  = new BinaryTreeNode(7);
        tree.left.left.right  = new BinaryTreeNode(2);
        tree.right.right.left = new BinaryTreeNode(5);
        tree.right.right.right = new BinaryTreeNode(1);

        PathSum pa= new PathSum();
        System.out.println(pa.hasPathSum(tree,22));

    }



}
