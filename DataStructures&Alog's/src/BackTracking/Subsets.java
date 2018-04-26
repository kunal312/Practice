package BackTracking;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

/**
 * Created by kunal on 4/25/18.
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

 Note: The solution set must not contain duplicate subsets.

 Example:

 Input: nums = [1,2,3]
 Output:
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */
public class Subsets {


    public List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subsetsHelper(res,new ArrayList<Integer>(),nums,0);
        System.out.println("Number of subsets:"+res.size());
        return res;

    }

    private void subsetsHelper(List<List<Integer>> res,List<Integer> temp, int[]nums,int start){
        List<Integer> t = new ArrayList<>(temp);
        res.add(t);
        printList(t);
        for(int i=start;i<nums.length;i++){
            //Choose one element
            temp.add(nums[i]);
            //Explore rest
            subsetsHelper(res,temp,nums,i+1);
            //Unchoose
            temp.remove(temp.size()-1);
        }
    }

    private void printList(List<Integer> list){
        if(list.size()==0)
            System.out.println("["+"]");
        for(int i=0;i<list.size();i++){
            System.out.print("["+list.get(i)+"]");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Subsets s = new Subsets();
        s.subsets(new int[]{1,2,3});
    }


}
