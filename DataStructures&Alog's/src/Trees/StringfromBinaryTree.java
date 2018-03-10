package Trees;
import  java.util.*;

/**
 * Created by kunal on 3/9/18.
 */
public class StringfromBinaryTree {


    public String stringfrombt(BinaryTreeNode root){


        Stack<BinaryTreeNode> stack = new Stack<>();
        HashSet<BinaryTreeNode> visited = new HashSet<>();
        String str="";
        if(root== null) return str;
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.peek();
            if(visited.contains(root)){
                stack.pop();
                str+=")";
            }else{
                visited.add(root);
                str+="("+root.data;
                if(root.left==null && root.right!=null){
                    str+="()";
                }
                if(root.right!=null) stack.push(root.right);
                if(root.left!=null) stack.push(root.left);
            }

        }


        return str.substring(1,str.length()-1);


    }


    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
//        tree.left.right = new BinaryTreeNode(5);
//        tree.right.left = new BinaryTreeNode(6);
//        tree.right.right = new BinaryTreeNode(7);

        StringfromBinaryTree s = new StringfromBinaryTree();
        System.out.println(s.stringfrombt(tree));

    }



}
