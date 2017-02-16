package Trees;
import java.util.*;

/**
 * Created by kunal on 2/13/17.
 */
public class InOrderTraversal {


    //Recursive

    public void InOrderRecursive(BinaryTreeNode root)
    {
        if(root!=null)
        {
            InOrderRecursive(root.left);
            System.out.print(root.data);
            InOrderRecursive(root.right);
        }


    }

    //Using Stack
    public void InOrderIterative(BinaryTreeNode root){

        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();

        BinaryTreeNode curr =root;
        boolean flag=false;

        while(!flag){

            if(curr!=null){
                s.push(curr);
                curr = curr.left;
            }
            else if(s.isEmpty()){
                flag=true;
            }

            else{
                curr = s.pop();
                System.out.print(curr.data);
                curr = curr.right;
            }

        }


    }

    //Without Stack Using Morris Traversal
    public void InOrderTraversalwithoutStack(BinaryTreeNode root){
        BinaryTreeNode curr = root;

        while(curr!=null){
            if(curr.left == null){
                System.out.print(curr.data);
                curr = curr.right;

            }
            else{
                BinaryTreeNode predecssor = curr.left;

                while(predecssor.right!=curr && predecssor.right!=null){
                    predecssor = predecssor.right;
                }

                if(predecssor.right==null){
                    predecssor.right =curr;
                    curr = curr.left;
                }else{
                    predecssor.right=null;
                    System.out.print(curr.data);
                    curr = curr.right;
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

        InOrderTraversal print = new InOrderTraversal();
        System.out.println("Recursive");
        print.InOrderRecursive(tree);
        System.out.println();
        System.out.println("Iterative");
        print.InOrderIterative(tree);
        System.out.println();
        System.out.println("UsingMorrisTraversal");
        print.InOrderTraversalwithoutStack(tree);
    }


}
