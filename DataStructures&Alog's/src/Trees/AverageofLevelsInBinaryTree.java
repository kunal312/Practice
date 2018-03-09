package Trees;
import java.util.*;
/**
 * Created by kunal on 3/9/18.
 */
public class AverageofLevelsInBinaryTree
{

    public List<Double> averageoflevels(BinaryTreeNode root){

        List<Double> res = new ArrayList<>();
        if(root == null) return res;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            long sum=0;
            int count=0;
            Queue<BinaryTreeNode> temp = new LinkedList<>();
            while(!q.isEmpty()){
                BinaryTreeNode curr = q.poll();
                sum+=curr.data;
                count++;
                if(curr.left!=null) temp.offer(curr.left);
                if(curr.right!=null) temp.offer(curr.right);
            }
            res.add((double)sum/count);
            q = temp;
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
        AverageofLevelsInBinaryTree avg = new AverageofLevelsInBinaryTree();
        List<Double> res = avg.averageoflevels(tree);
        for(Double i:res){
            System.out.println(i);
        }

    }




}
