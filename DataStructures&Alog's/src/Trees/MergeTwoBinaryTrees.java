package Trees;
import  java.util.*;

/**
 * Created by kunal on 3/7/18.
 */

/*
*   Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
Otherwise, the NOT null node will be used as the node of new tree.
*
* Input:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7
Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
*
* */

public class MergeTwoBinaryTrees {

    //Time Complexity: O(n) where n = min num of nodes from the two given trees
    //Space Complexity: O(n) where n = depth of recursion, can be log(n)  in average case

    public BinaryTreeNode mergeTreesusingRecursion(BinaryTreeNode t1, BinaryTreeNode t2){

        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.data += t2.data;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }


    //Time Complexity: O(n) where n = min num of nodes from the two given trees
    //Space Complexity: O(n) where n = depth of tree
    public BinaryTreeNode mergeTrees(BinaryTreeNode t1, BinaryTreeNode t2){

        if(t1==null) return t2;
        Stack<BinaryTreeNode[]> s = new Stack<>();
        BinaryTreeNode [] tx={t1,t2};
        s.push(tx);
        while(!s.isEmpty()){
            BinaryTreeNode [] t= s.pop();
            if(t[0]==null || t[1] ==null) continue;
            t[0].data+=t[1].data;

            if(t[0].left ==null){
                t[0].left = t[1].left;
            }else{
                s.push(new BinaryTreeNode [] {t[0].left,t[1].left});
            }

            if(t[0].right==null){
                t[0].right =t[1].right;
            }else
                s.push(new BinaryTreeNode [] {t[0].right,t[1].right});

        }

        return t1;
    }

    public static void main(String[] args) {
        BinaryTreeNode tree1 = new BinaryTreeNode(1);
        tree1.left = new BinaryTreeNode(3);
        tree1.right = new BinaryTreeNode(2);
        tree1.left.left = new BinaryTreeNode(5);

        BinaryTreeNode tree2 = new BinaryTreeNode(2);
        tree2.left = new BinaryTreeNode(1);
        tree2.right = new BinaryTreeNode(3);
        tree2.left.right = new BinaryTreeNode(4);
        tree2.right.right = new BinaryTreeNode(7);

        MergeTwoBinaryTrees m = new MergeTwoBinaryTrees();

        System.out.println(m.mergeTrees(tree1,tree2).data);


    }



}
