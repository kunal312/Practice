package BackTracking;
import java.util.*;

/**
 * Created by kunal on 4/25/18.
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

 Note: The solution set must not contain duplicate subsets.

 Example:

 Input: [1,2,2]
 Output:
 [
 [2],
 [1],
 [1,2,2],
 [2,2],
 [1,2],
 []
 ]
 */
public class Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums==null || nums.length==0) return res;
        subsetsWithDupHelper(res,new ArrayList<>(),nums,0);
        System.out.println("Number of Unique sets:"+res.size());
        return res;


    }
    private void subsetsWithDupHelper(List<List<Integer>> res, List<Integer> temp, int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            subsetsWithDupHelper(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Subsets2 s = new Subsets2();
        s.subsetsWithDup(new int[]{1,2,2});
    }

    }
