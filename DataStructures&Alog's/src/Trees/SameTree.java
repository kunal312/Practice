package Trees;
import  java.util.*;
/**
 * Created by kunal on 3/9/18.
 */
public class SameTree {


    public boolean isSameTree(BinaryTreeNode p,BinaryTreeNode q){


        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        Queue<BinaryTreeNode> qp = new LinkedList<>();
        Queue<BinaryTreeNode> qq = new LinkedList<>();
        qp.offer(p);
        qq.offer(q);
        while(!qp.isEmpty()){
            p=qp.poll();
            q=qq.poll();
            if(p.data!=q.data) return false;
            if(p.left!=null && q.left!=null){
                qp.offer(p.left);
                qq.offer(q.left);
            } else if(p.left==null && q.left!=null) return false;
            else if (p.left!=null && q.left==null) return false;

            if(p.right!=null && q.right!=null){
                qp.offer(p.right);
                qq.offer(q.right);
            }else if(p.right==null && q.right!=null) return false;
            else if (p.right!=null && q.right==null) return false;
        }

        return true;



    }

    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);

        BinaryTreeNode tree1 = new BinaryTreeNode(1);
        tree1.left = new BinaryTreeNode(2);
        tree1.right = new BinaryTreeNode(3);
        tree1.left.left = new BinaryTreeNode(4);
        tree1.left.right = new BinaryTreeNode(5);
        tree1.right.left = new BinaryTreeNode(6);
        //tree1.right.right = new BinaryTreeNode(7);

        SameTree same = new SameTree();
        System.out.println(same.isSameTree(tree,tree1));



    }
}
