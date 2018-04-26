package BackTracking;
import java.util.*;

/**
 * Created by kunal on 4/25/18.
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>>  res = new ArrayList<>();
        if(nums==null || nums.length==0) return res;
        //Arrays.sort(nums); //No sorting necessay since we are already calculating permutaions
        permuteHelper(res,new ArrayList<>(),nums,"");

        return res;
    }

    private void permuteHelper(List<List<Integer>> res, List<Integer> temp, int[] nums,String indent){
       //print
        //String r="";
        //Just for printing to understand
        for(int i=0;i<temp.size();i++){
            System.out.println(indent+temp.get(i));
        }



        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            permuteHelper(res,temp,nums,indent +"    ");
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        Permutations p = new Permutations();
        p.permute(new int[]{1,2,3});
    }

}
