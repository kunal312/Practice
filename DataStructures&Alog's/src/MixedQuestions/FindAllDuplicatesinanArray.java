package MixedQuestions;

import java.util.*;

/**
 * Created by kunal on 3/30/18.
 */
public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index =  Math.abs(nums[i]) -1;
            if(nums[index] <0) res.add(index+1);

            nums[index]*=-1;
        }
        return res;

    }

    public static void main(String[] args) {
        FindAllDuplicatesinanArray f = new FindAllDuplicatesinanArray();
        List<Integer> res = f.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
        Iterator it = res.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
