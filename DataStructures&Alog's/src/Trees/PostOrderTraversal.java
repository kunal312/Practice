package Trees;

import java.util.*;

/**
 * Created by kunal on 2/13/17.
 */
public class PostOrderTraversal {



    public void PostOrdereRecursive(BinaryTreeNode root)
    {
        if(root!=null)
        {

            PostOrdereRecursive(root.left);
            PostOrdereRecursive(root.right);
            System.out.print(root.data);


        }
    }

    public void PostOrderOneStack(BinaryTreeNode root){

        if(root==null)
        {
            return;
        }

        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);

        BinaryTreeNode prev = null;

        while(!s.isEmpty()){
            BinaryTreeNode curr = s.peek();

            if(prev==null || prev.left==curr || prev.right==curr)
            {
                if(curr.left!=null)
                {
                    s.push(curr.left);
                }
                else if(curr.right!=null)
                {
                    s.push(curr.right);
                }
            } else if(curr.left == prev){
                if(curr.right!=null)
                {
                    s.push(curr.right);
                }
            } else{
                System.out.print(curr.data);
                s.pop();
            }

            prev = curr;


        }

    }


    public void PostOrderTwoStack(BinaryTreeNode root){
        Stack<BinaryTreeNode> s1 = new Stack<BinaryTreeNode>();
        Stack<BinaryTreeNode> s2 = new Stack<BinaryTreeNode>();
        s1.push(root);
        while(!s1.isEmpty())

        {
            BinaryTreeNode temp =  s1.pop();
            s2.push(temp);

            if(temp.left!=null)
                s1.push(temp.left);
            if(temp.right!=null)
            s1.push(temp.right);

        }

        while(!s2.isEmpty()){
            System.out.print(s2.pop().data);
        }


    }





    public static void main(String[] args)
    {
        BinaryTreeNode tree = new BinaryTreeNode(1);

        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);


        PostOrderTraversal print = new PostOrderTraversal();
        System.out.println("Recursive");
        print.PostOrdereRecursive(tree);
        System.out.println();
        System.out.println("One Stack");
        print.PostOrderOneStack(tree);
        System.out.println();
        System.out.println("Two Stack");
        print.PostOrderTwoStack(tree);

    }

}
