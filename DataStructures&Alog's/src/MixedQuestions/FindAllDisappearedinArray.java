package MixedQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kunal on 3/30/18.
 */
public class FindAllDisappearedinArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            int index = Math.abs(i)-1;
            if(nums[index]>0)
                nums[index]*=-1;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) res.add(i+1);
        }
        return res;

    }

    public static void main(String[] args) {
        FindAllDisappearedinArray f = new FindAllDisappearedinArray();
        List<Integer> res = f.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        Iterator it = res.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    }

