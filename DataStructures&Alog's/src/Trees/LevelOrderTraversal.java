package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kunal on 2/14/17.
 */
public class LevelOrderTraversal {

    //with queue

    public void LevelOrderTraversalwithQueue(BinaryTreeNode root){

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while(!q.isEmpty()) {

            BinaryTreeNode tmp = q.poll();
            System.out.print(tmp.data);
            if(tmp.left!=null){
                q.offer(tmp.left);

            }
            if(tmp.right!=null)
                q.offer(tmp.right);

        }

    }

    //with recursion
    public int maxElement(BinaryTreeNode root){
        int maxValue = Integer.MIN_VALUE;
        if(root!=null){
            int leftMax = maxElement(root.left);
            int rightMax = maxElement(root.right);
            if(leftMax>rightMax){
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
            if(tmp.left!=null)
                q.offer(tmp.left);
            if(tmp.right!=null)
                q.offer(tmp.right);
        }

        return maxValue;
    }


    public static void main(String[] args){
        BinaryTreeNode tree = new BinaryTreeNode(1);

        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);

        LevelOrderTraversal print = new LevelOrderTraversal();
        print.LevelOrderTraversalwithQueue(tree);
        System.out.println();

        System.out.println("Max with recursion= "+print.maxElement(tree));

        System.out.println("Max without recursion= "+print.maxElementWithoutRecursion(tree));
    }
}
