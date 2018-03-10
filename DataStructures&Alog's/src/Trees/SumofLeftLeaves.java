package Trees;
import java.util.*;

/**
 * Created by kunal on 3/9/18.
 */
public class SumofLeftLeaves {

    public int sumOfLeftLeaves(BinaryTreeNode root) {
        if(root ==null) return 0;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum=0;

        while(!q.isEmpty()){
            root = q.poll();
            if(root.left!=null){
                if(root.left.left==null && root.left.right==null)
                {
                    sum+=root.left.data;
                }
                else{
                    q.offer(root.left);
                }
            }
            if(root.right!=null){
                if(root.right.left!=null || root.right.right!=null)
                    q.offer(root.right);
            }
        }



        return sum;
    }

    public static void main(String[] args) {

        BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);
        SumofLeftLeaves s = new SumofLeftLeaves();
        System.out.println(s.sumOfLeftLeaves(tree));


    }

}
