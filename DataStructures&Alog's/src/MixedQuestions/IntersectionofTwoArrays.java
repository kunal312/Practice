package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 3/16/18.
 */
public class IntersectionofTwoArrays {


    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1= new HashSet<>();

        Set<Integer> res = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }

        for(int num:nums2){
            if(set1.contains(num)){
                res.add(num);
            }
        }
        int result[] = new int[res.size()];
        int i =0;
        for(int r: res){
            result[i++] =  r;
        }
        return result;

    }

    public static void main(String[] args) {
        IntersectionofTwoArrays i = new IntersectionofTwoArrays();
        i.intersection(new int[]{1,2,2,1},new int[]{2,2});
    }

}
