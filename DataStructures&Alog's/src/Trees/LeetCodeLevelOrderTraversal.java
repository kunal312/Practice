package Trees;
import java.util.*;

/**
 * Created by kunal on 3/18/18.
 * return all levels.
 */
public class LeetCodeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(BinaryTreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root== null) return res;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            ArrayList<Integer> levelres= new ArrayList<>();
            for(int i =0;i<levelSize;i++){
                root=q.poll();
                if(root.left!=null) q.offer(root.left);
                if(root.right!=null) q.offer(root.right);
                levelres.add(root.data);
            }
            res.add(levelres);
        }


        return res;
    }


    public List<List<Integer>> levelOrderwith2queues(BinaryTreeNode root) {


        List<List<Integer>> res  = new ArrayList<>();
         if(root==null) return res;
         Queue<BinaryTreeNode> q = new LinkedList<>();
         q.offer(root);

         while(!q.isEmpty()){

             Queue<BinaryTreeNode> temp = new LinkedList<>();
             ArrayList<Integer> listLevel= new ArrayList<>();
             while(!q.isEmpty()){
             root=q.poll();
             listLevel.add(root.data);

             if(root.left!=null) temp.offer(root.left);
             if(root.right!=null) temp.offer(root.right);
             }
             q=temp;
             res.add(listLevel);

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

        LeetCodeLevelOrderTraversal l = new LeetCodeLevelOrderTraversal();
        l.levelOrder(tree);
    }


}
