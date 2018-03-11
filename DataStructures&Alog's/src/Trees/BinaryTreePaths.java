package Trees;
import java.util.*;

/**
 * Created by kunal on 3/10/18.
 * Given a binary tree, return all root-to-leaf paths.

 For example, given the following binary tree:

 1
 /   \
 2     3
 \
 5
 All root-to-leaf paths are:

 ["1->2->5", "1->3"]
 *
 *
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(BinaryTreeNode root){

        List<String> res = new ArrayList<>();
        Queue<BinaryTreeNode> qNode  = new LinkedList<>();
        Queue<String> qStr = new LinkedList<>();
        qNode.offer(root);
        qStr.offer("");
        while(!qNode.isEmpty()){

            root =qNode.poll();
            String str = qStr.poll();

            if(root.left == null && root.right==null){
                res.add(str+root.data);
                System.out.println(str+root.data);
            }

            if(root.left!=null){
                qNode.offer(root.left);
                qStr.offer(str+root.data+"->");

            }

            if(root.right!=null){
                qNode.offer(root.right);
                qStr.offer(str+root.data+"->");
            }



        }

        return res;

    }

    public static void main(String[] args) {

        BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.right = new BinaryTreeNode(5);
        BinaryTreePaths path = new BinaryTreePaths();
        path.binaryTreePaths(tree);
    }




}
