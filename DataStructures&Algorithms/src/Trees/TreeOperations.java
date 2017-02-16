package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kunal on 2/14/17.
 */
public class TreeOperations {

    //with recursion
    public int maxElement(BinaryTreeNode root){
        int maxValue = Integer.MIN_VALUE;
        if(root!=null){
            int leftMax = maxElement(root.left);
            int rightMax = maxElement(root.right);
            if(leftMax<rightMax){
                maxValue = leftMax;
            }
            else
                maxValue = rightMax;

            if(root.data>maxValue)
                maxValue = root.data;
        }
        return maxValue;
    }

    //without recursion
    public  int maxElementWithoutRecursion(BinaryTreeNode root){

        int maxValue = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.data>maxValue){
                maxValue = tmp.data;
            }
            if(tmp!=null){
                if(tmp.left!=null)
                    q.offer(tmp.left);
                if(tmp.right!=null)
                    q.offer(tmp.right);
            }

        }

        return maxValue;
    }

    public int findHeightofTree(BinaryTreeNode root){

        if(root==null){
            return 0;

        }

        int leftDepth = findHeightofTree(root.left);
        System.out.println("Left Depth:"+leftDepth);
        int rightDepth = findHeightofTree(root.right);
        System.out.println("Right Depth:"+rightDepth);

        if(leftDepth>rightDepth){
            System.out.println("Left Depth:"+leftDepth);
            return leftDepth+1;
        }
        else{
            System.out.println("Right Depth:"+rightDepth);
            return rightDepth+1;

        }

    }



    public boolean searchElement(BinaryTreeNode root,int data) {


        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if (tmp.data == data) {
                return true;
            } else {

                if (tmp.left != null)
                    q.offer(tmp.left);
                if (tmp.right != null)
                    q.offer(tmp.right);
            }

        }
        return false;
    }

    public static void main(String[] args){
        BinaryTreeNode tree = new BinaryTreeNode(1);

        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);

        TreeOperations print = new TreeOperations();
        System.out.println("Max with recursion= "+print.maxElement(tree));

        System.out.println("Max without recursion= "+print.maxElementWithoutRecursion(tree));

        System.out.println("Find Element= "+print.searchElement(tree,5));

        System.out.println("Depth Recursive:"+print.findHeightofTree(tree));




    }

}
