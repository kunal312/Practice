package Trees;
import java.util.*;

/**
 * Created by kunal on 3/11/18.
 */
public class PathSum2 {


    public List<List<Integer>> pathSum(BinaryTreeNode root, int sum) {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    Stack<BinaryTreeNode> stack = new Stack<>();
    int psum = 0;
    BinaryTreeNode curr = root;
    BinaryTreeNode pre = null;
        while(curr!=null||!stack.isEmpty())

    {

        while (curr != null) {
            stack.push(curr);
            path.add(curr.data);
            psum += curr.data;
            curr = curr.left;
        }

        curr = stack.peek();
        if (curr.right != null && curr.right != pre) {
            curr = curr.right;
            continue;
        }

        if (curr.left == null && curr.right == null && sum == psum) {
            res.add(new ArrayList<Integer>(path));
        }

        pre = curr;
        stack.pop();
        path.remove(path.size() - 1);
        psum -= curr.data;
        curr = null;

    }
    return res;
}


    /*BFS*/

//    public List<List<Integer>> pathSum(BinaryTreeNode root, int sum) {
//        List<List<Integer>> res= new ArrayList<>();
//        if(root==null) return res;
//        Queue<BinaryTreeNode> qNode = new LinkedList<>();
//        Queue<ArrayList<Integer>> qSum = new LinkedList<>();
//        qNode.offer(root);
//        int pathSum=0;
//        while(!qNode.isEmpty()){
//            root = qNode.poll();
//            ArrayList<Integer> partialSum = new ArrayList<>();
//            if(!qSum.isEmpty()){
//                partialSum = qSum.poll();
//            }
//            if(root.left==null && root.right==null){
//
//                int sm=0;
//                if(partialSum.size()>0){
//                    sm=partialSum.get(partialSum.size()-1);
//                }
//                if(sm+root.data==sum){
//                    if(partialSum.size()>0){
//                        partialSum.remove(partialSum.size()-1);
//                    }
//
//                    partialSum.add(root.data);
//
//                    res.add(partialSum);
//                }
//            }
//            if(root.left!=null && root.right!=null){
//
//                qNode.offer(root.left);
//                int tsum=0;
//                if(partialSum.size()>0){
//                    tsum = partialSum.get(partialSum.size()-1);
//                    partialSum.remove(partialSum.size()-1);
//                }
//                partialSum.add(root.data);
//                pathSum = tsum +root.data;
//                partialSum.add(pathSum);
//                qSum.offer(new ArrayList<>(partialSum));
//                qNode.offer(root.right);
//                qSum.offer(new ArrayList<>(partialSum));
//            } else if(root.left!=null && root.right==null){
//                qNode.offer(root.left);
//
//                int tsum=0;
//                if(partialSum.size()>0){
//                    tsum = partialSum.get(partialSum.size()-1);
//                    partialSum.remove(partialSum.size()-1);
//                }
//
//                partialSum.add(root.data);
//                pathSum = tsum +root.data;
//                partialSum.add(pathSum);
//                qSum.add(new ArrayList<>(partialSum));
//            }else if(root.left==null && root.right!=null){
//                qNode.offer(root.right);
//
//                int tsum=0;
//                if(partialSum.size()>0){
//                    tsum = partialSum.get(partialSum.size()-1);
//                    partialSum.remove(partialSum.size()-1);
//                }
//
//                partialSum.add(root.data);
//                pathSum = tsum +root.data;
//                partialSum.add(pathSum);
//                qSum.add(new ArrayList<>(partialSum));
//            }
//        }
//        return res;
//    }

    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(5);

        tree.left = new BinaryTreeNode(4);
        tree.right = new BinaryTreeNode(8);
        tree.left.left = new BinaryTreeNode(11);
        //tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(13);
        tree.right.right = new BinaryTreeNode(4);
        tree.left.left.left  = new BinaryTreeNode(7);
        tree.left.left.right  = new BinaryTreeNode(2);
        tree.right.right.left = new BinaryTreeNode(5);
        tree.right.right.right = new BinaryTreeNode(1);

        PathSum2 pa= new PathSum2();
        pa.pathSum(tree,22);

    }


}
