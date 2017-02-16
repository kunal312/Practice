package Trees;
import java.util.*;
/**
 * Created by kunal on 2/14/17.
 */
public class PreOrderTraversal {


    public void PreOrderRecursion(BinaryTreeNode root){

        if(root!=null) {
            System.out.print(root.data);
            PreOrderRecursion(root.left);
            PreOrderRecursion(root.right);
        }

    }


    public void PreOrderWithOneStack(BinaryTreeNode root){
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);

        while(!s.isEmpty()){
            BinaryTreeNode temp = s.pop();
            System.out.print(temp.data);
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
        }
    }

    public void PreOrderWithMorris(BinaryTreeNode root){

        BinaryTreeNode curr = root;
        while(curr!=null){

            if(curr.left==null){
                System.out.print(curr.data);
                curr = curr.right;
            }
            else{
                BinaryTreeNode pred = curr.left;
                while(pred.right!=curr && pred.right!=null){
                    pred = pred.right;
                }

                if(pred.right==null){
                    pred.right = curr;
                    System.out.print(curr.data);
                    curr = curr.left;
                }
                else{
                    pred.right = null;
                    curr =curr.right;

                }
            }
        }
    }

    public static void main(String[] args){
        BinaryTreeNode tree = new BinaryTreeNode(1);

        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);

        PreOrderTraversal print = new PreOrderTraversal();
        System.out.println("Recursive");
        print.PreOrderRecursion(tree);
        System.out.println();
        System.out.println("With One Stack");
        print.PreOrderWithOneStack(tree);
        System.out.println();
        System.out.print("Morris Traversal");
        System.out.println();
        print.PreOrderWithMorris(tree);


    }
}
